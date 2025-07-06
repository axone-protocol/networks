<!-- generated file - do not edit -->
# 🔗 `axone-1`

![chain-id](https://img.shields.io/badge/chain%20id-axone--1-blue?style=for-the-badge)
[![stability-release-candidate](https://img.shields.io/badge/stability-pre--release-48c9b0.svg)](https://github.com/mkenney/software-guides/blob/master/STABILITY-BADGES.md#release-candidate)
![audience](https://img.shields.io/badge/audience-public-white.svg?style=for-the-badge)
![incentivized-✖️](https://img.shields.io/badge/incentivized-✖️-29220A.svg?style=for-the-badge)
![genesis-time](https://img.shields.io/badge/%E2%8F%B0%20genesis%20time-2025--07--08T18%3A20%3A00Z-red?style=for-the-badge)

## Register in the Genesis

To register your validator node in the `genesis.json` you just need to provide a signed `gentx` with an initial delegation of `1000000000000uaxone` in a [⚖️ Register Validator issue](https://github.com/axone-protocol/networks/issues).

The gentx generation can be done as follow (this is an example script, adapt it to your needs) with the [axoned](https://github.com/axone-protocol/axoned/releases) binary matching the [network's version](/chains/dentrite-1/version.txt):

```sh
# Init node
axoned --home mynode init your-moniker --chain-id axone-1

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
  --chain-id axone-1 \
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
      <td><pre>Easy 2 Stake</pre></td>
      <td>Complete transparency and trust with a secure and stable validator</td>
      <td></td>
      <td><a href="https://www.easy2stake.com">https://www.easy2stake.com</a></tr>
    <tr>
      <td><pre>Cumulo</pre></td>
      <td>Cumulo is a leading trusted validator and a valuable asset to the blockchain ecosystem bringing security, quality and growth to the network. Boost your token staking earnings with Cumulo. Grow with us.</td>
      <td>
        <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/521c38ac16cf63f7cd1f6506398dd005_200_200.jpg"/></p>
        <a href="https://keybase.io/cumulo">77158D6796D16CD0</a></td>
      <td><a href="http://cumulo.pro">http://cumulo.pro</a></tr>
    <tr>
      <td><pre>AKNodes</pre></td>
      <td>At AKNodes, we are more than just a PoS validator; we are your trusted partner in navigating the exciting world of Proof-of-Stake blockchain networks.</td>
      <td>
        <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/111162c2171635295e75ed493ce00f05_200_200.jpg"/></p>
        <a href="https://keybase.io/appieasahbie">A7E4FBD93B7705E0</a></td>
      <td><a href="https://aknodes.com">https://aknodes.com</a></tr>
    <tr>
      <td><pre>High Stakes Switzerland</pre></td>
      <td>Join our loyalty program at https://app.highstakes.ch and boost your staking rewards! TG: t.me/HighStakesSwitzerland</td>
      <td>
        <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/652a26ea35e2879b1c9712b405819505_200_200.jpg"/></p>
        <a href="https://keybase.io/highstakes_ch">08B50C4CBBAF1EE1</a></td>
      <td><a href="https://highstakes.ch">https://highstakes.ch</a></tr>
    <tr>
      <td><pre>node</pre></td>
      <td>community driven validator</td>
      <td>
        <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/273625e88af0407ae3a1134eca418a05_200_200.jpg"/></p>
        <a href="https://keybase.io/jayjayone">34589DAF06970635</a></td>
      <td><a href="https://twitter.com/javalry1">https://twitter.com/javalry1</a></tr>
</table>
