<!-- generated file - do not edit -->
# 🔗 `axone-dentrite-1`

![chain-id](https://img.shields.io/badge/chain%20id-axone--dentrite--1-blue?style=for-the-badge)
[![stability-beta](https://img.shields.io/badge/stability-beta-33bbff.svg?style=for-the-badge)](https://github.com/mkenney/software-guides/blob/master/STABILITY-BADGES.md#beta)
![audience](https://img.shields.io/badge/audience-public-white.svg?style=for-the-badge)
![incentivized-✖️](https://img.shields.io/badge/incentivized-✖️-29220A.svg?style=for-the-badge)
![genesis-time](https://img.shields.io/badge/%E2%8F%B0%20genesis%20time-2024--09--10T12%3A00%3A00Z-red?style=for-the-badge)

## Register in the Genesis

To register your validator node in the `genesis.json` you just need to provide a signed `gentx` with an initial delegation of `1000000000000uaxone` in a [⚖️ Register Validator issue](https://github.com/axone-protocol/networks/issues).

The gentx generation can be done as follow (this is an example script, adapt it to your needs) with the [axoned](https://github.com/axone-protocol/axoned/releases) binary matching the [network's version](/chains/dentrite-1/version.txt):

```sh
# Init node
axoned --home mynode init your-moniker --chain-id axone-dentrite-1

# Create keys, be careful with the mnemonic 👀
axoned --home mynode keys add your-key-name

# Set account necessary balance
axoned --home mynode genesis add-genesis-account your-key-name 1000000000000uaxone
```

Then create your own genesis transaction (`gentx`). You will have to choose the following parameters for your validator: `commission-rate`, `commission-max-rate`, `commission-max-change-rate`, `min-self-delegation` (>=1), `website` (optional), `details` (optional), `identity` ([keybase](https://keybase.io) key hash, used to get validator logos in block explorers - optional), `security-contact` (email - optional).

```sh
# Create the gentx
axoned --home mynode genesis gentx your-key-name 1000000000000uaxone \
  --node-id $(axoned --home mynode comet show-node-id) \
  --chain-id axone-dentrite-1 \
  --commission-rate 0.05 \
  --commission-max-rate 0.2 \
  --commission-max-change-rate 0.01 \
  --min-self-delegation 1 \
  --website "https://foo.network" \
  --details "My validator" \
  --identity "6C36E7C076BFDCE4" \
  --security-contact "validator@foo.network"
```

## Genesis validators

<table>
  <tr>
    <th>Moniker</th>
    <th>Details</th>
    <th>Identity</th>
    <th>Site</th>
  </tr>
  <tr>
    <td><pre>NodeStake</pre></td>
    <td>NodeStake is the professional validator, infrastructure provider and IBC relayer. ⚛️7*24h Services | https://twitter.com/Nodestake_top</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/5912a329316356b98611c807d0c11e05_200_200.jpg"/></p>
      <a href="https://keybase.io/nodestake">94EFE192B2C52424</a></td>
    <td><a href="https://nodestake.org">https://nodestake.org</a></tr>
  <tr>
    <td><pre>HSS</pre></td>
    <td></td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/53b008f12f37e3ffa0dec3676d375a05_200_200.jpg"/></p>
      <a href="https://keybase.io/highstakes">2CB281A714F6133B</a></td>
    <td><a href="https://highstakes.ch">https://highstakes.ch</a></tr>
  <tr>
    <td><pre> Lavender.Five Nodes 🐝</pre></td>
    <td>Fortifying crypto networks with Horcrux security, slash insurance, and open source contributions. Connect with us at https://linktr.ee/lavenderfive.</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/c5f0e5c3c88a6194da5277d3eb297805_200_200.jpg"/></p>
      <a href="https://keybase.io/lavenderfive">F87ADDB700C0CC94</a></td>
    <td><a href="https://www.lavenderfive.com/">https://www.lavenderfive.com/</a></tr>
  <tr>
    <td><pre>AKNodes</pre></td>
    <td>At AKNodes, we are more than just a PoS validator; we are your trusted partner in navigating the exciting world of Proof-of-Stake blockchain networks</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/111162c2171635295e75ed493ce00f05_200_200.jpg"/></p>
      <a href="https://keybase.io/appieasahbie">A7E4FBD93B7705E0</a></td>
    <td><a href="https://aknodes.com">https://aknodes.com</a></tr>
  <tr>
    <td><pre>polkachu.com</pre></td>
    <td>Polkachu is the trusted staking service provider for blockchain projects. 100% refund for downtime slash. Contact us at hello@polkachu.com</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/d56ce0bdda17f73d4aa895d1626e2505_200_200.jpg"/></p>
      <a href="https://keybase.io/polkachu">0A6AF02D1557E5B4</a></td>
    <td><a href="https://polkachu.com">https://polkachu.com</a></tr>
  <tr>
    <td><pre>Nodeist</pre></td>
    <td>Nodeist is the trusted staking service provider for blockchain projects. 100% refund for downtime slash. Contact us at hello@nodeist.net</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/e16ba5abb8e81fe864c1809c0f8e6c05_200_200.jpg"/></p>
      <a href="https://keybase.io/nodeistt">A2E180C6914F7F87</a></td>
    <td><a href="https://nodeist.net">https://nodeist.net</a></tr>
  <tr>
    <td><pre>HashKey Cloud</pre></td>
    <td>Cloud for WEB3 More Than Staking</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/0a30469c4d49aa836b58cab6a59b9005_200_200.jpg"/></p>
      <a href="https://keybase.io/hashkeycloud">CB79CF86DBD56A19</a></td>
    <td><a href="https://www.hashkey.cloud/">https://www.hashkey.cloud/</a></tr>
  <tr>
    <td><pre>Mike</pre></td>
    <td>MA_Kupriianov</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/a42b13f570317e45d6e6a58252bdac05_200_200.jpg"/></p>
      <a href="https://keybase.io/ma_kupriianov">8D8E37C00E16A546</a></td>
    <td><a href="https://github.com/88Mikhail88">https://github.com/88Mikhail88</a></tr>
  <tr>
    <td><pre>jayjay</pre></td>
    <td>community driven validator</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/273625e88af0407ae3a1134eca418a05_200_200.jpg"/></p>
      <a href="https://keybase.io/jayjayone">34589DAF06970635</a></td>
    <td><a href="https://twitter.com/javalry1">https://twitter.com/javalry1</a></tr>
  <tr>
    <td><pre>NODEJUMPER</pre></td>
    <td>Professional POS Validator services, Cosmos contributors and supporters, Restake.app compatible. Making the blockchain world a better place.</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/8506223c573a1bee45e9182de7684805_200_200.jpg"/></p>
      <a href="https://keybase.io/nodejumper">FFB0AA51A2DF5954</a></td>
    <td><a href="https://nodejumper.io">https://nodejumper.io</a></tr>
  <tr>
    <td><pre>Easy2Stake</pre></td>
    <td>Easy.Stake.Trust</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/64e2ff0c8b5bc90725be9acb11564705_200_200.jpg"/></p>
      <a href="https://keybase.io/easy2stake">2C877AC873132C91</a></td>
    <td><a href="https://www.easy2stake.com/">https://www.easy2stake.com/</a></tr>
  <tr>
    <td><pre>Saxon</pre></td>
    <td>Saxon is a technology-driven advisory and investment firm that serves start-ups and institutions that operate within the Web3 &amp; cryptocurrency ecosystem</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/25b3916cb3f187f0dc80035d8ff50b05_200_200.jpg"/></p>
      <a href="https://keybase.io/saxonxyz">d358f6bf2e1b525d</a></td>
    <td><a href="https://saxon.xyz/">https://saxon.xyz/</a></tr>
</table>
