<!-- generated file - do not edit -->
# 🔗 `okp4-drunemeton-1`

![chain-id](https://img.shields.io/badge/chain%20id-okp4--drunemeton--1-blue?style=for-the-badge)
[![stability-wip](https://img.shields.io/badge/stability-wip-lightgrey.svg)](https://github.com/mkenney/software-guides/blob/master/STABILITY-BADGES.md#work-in-progress)
![audience](https://img.shields.io/badge/audience-public-white.svg?style=for-the-badge)
![genesis-time](https://img.shields.io/badge/%E2%8F%B0%20genesis%20time-2024--02--06T15%3A00%3A00Z-red?style=for-the-badge)

## Register in the Genesis

To register your validator node in the `genesis.json` you just need to provide a signed `gentx` with an initial delegation of `10000000000uknow` in a [⚖️ Register Validator issue](https://github.com/okp4/networks/issues).

The gentx generation can be done as follow (this is an example script, adapt it to your needs) with the [okp4d](https://github.com/okp4/okp4d/releases) binary matching the [network's version](/chains/drunemeton-1/version.txt):

```sh
# Init node
okp4d --home mynode init your-moniker --chain-id okp4-drunemeton-1

# Create keys, be careful with the mnemonic 👀
okp4d --home mynode keys add your-key-name

# Set account necessary balance
okp4d --home mynode genesis add-genesis-account your-key-name 10000200000uknow
```

Then create your own genesis transaction (`gentx`). You will have to choose the following parameters for your validator: `commission-rate`, `commission-max-rate`, `commission-max-change-rate`, `min-self-delegation` (>=1), `website` (optional), `details` (optional), `identity` ([keybase](https://keybase.io) key hash, used to get validator logos in block explorers - optional), `security-contact` (email - optional).

```sh
# Create the gentx
okp4d --home mynode genesis gentx your-key-name 10000000000uknow \
  --node-id $(okp4d --home mynode tendermint show-node-id) \
  --chain-id okp4-drunemeton-1 \
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
    <td><pre>polkachu.com</pre></td>
    <td>Polkachu is the trusted staking service provider for blockchain projects. 100% refund for downtime slash. Contact us at hello@polkachu.com</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/d56ce0bdda17f73d4aa895d1626e2505_200_200.jpg"/></p>
      <a href="https://keybase.io/polkachu">0A6AF02D1557E5B4</a></td>
    <td><a href="https://polkachu.com">https://polkachu.com</a></tr>
  <tr>
    <td><pre>jayjay</pre></td>
    <td>community driven validator</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/273625e88af0407ae3a1134eca418a05_200_200.jpg"/></p>
      <a href="https://keybase.io/jayjayone">34589DAF06970635</a></td>
    <td><a href="https://twitter.com/javalry1">https://twitter.com/javalry1</a></tr>
  <tr>
    <td><pre>StakeLab</pre></td>
    <td>Grow your assets - Staking &amp; Relaying Hub for Cosmos ecosystem</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/63585765d299338807f158d6aadd2e05_200_200.jpg"/></p>
      <a href="https://keybase.io/stakelab">F12B081334CBE0C6</a></td>
    <td><a href="https://www.stakelab.zone">https://www.stakelab.zone</a></tr>
  <tr>
    <td><pre>Cumulo</pre></td>
    <td>feeding your flame</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/521c38ac16cf63f7cd1f6506398dd005_200_200.jpg"/></p>
      <a href="https://keybase.io/cumulo">77158D6796D16CD0</a></td>
    <td><a href="http://cumulo.pro">http://cumulo.pro</a></tr>
  <tr>
    <td><pre>NodeStake</pre></td>
    <td>NodeStake is the professional validator, infrastructure provider and IBC relayer. ⚛️7*24h Services | https://twitter.com/Nodestake_top</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/5912a329316356b98611c807d0c11e05_200_200.jpg"/></p>
      <a href="https://keybase.io/nodestake">94EFE192B2C52424</a></td>
    <td><a href="https://nodestake.org">https://nodestake.org</a></tr>
  <tr>
    <td><pre>NODEJUMPER</pre></td>
    <td>Professional POS Validator services, Cosmos contributors and supporters, Restake.app compatible. Making the blockchain world a better place.</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/8506223c573a1bee45e9182de7684805_200_200.jpg"/></p>
      <a href="https://keybase.io/nodejumper">FFB0AA51A2DF5954</a></td>
    <td><a href="https://nodejumper.io">https://nodejumper.io</a></tr>
  <tr>
    <td><pre>Citadel.one</pre></td>
    <td>Citadel.one is a multi-asset non-custodial staking platform that lets anyone become a part of decentralized infrastructure and earn passive income. Stake with our nodes or any other validator across multiple networks in a few clicks</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/2826e38259411adafb416505fb948c05_200_200.jpg"/></p>
      <a href="https://keybase.io/citadeldao">EBB03EB4BB4CFCA7</a></td>
    <td><a href="https://citadel.one">https://citadel.one</a></tr>
  <tr>
    <td><pre>HSS</pre></td>
    <td></td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/53b008f12f37e3ffa0dec3676d375a05_200_200.jpg"/></p>
      <a href="https://keybase.io/highstakes">2CB281A714F6133B</a></td>
    <td><a href="https://highstakes.ch">https://highstakes.ch</a></tr>
  <tr>
    <td><pre>AVIAONE.com 🟢</pre></td>
    <td>Staking with Aviaone 🟢 generate a yield and your tokens stays on your wallet 🔑 🔒. NO TRANSFER REQUIRED 👍</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/26cb2814f06d1832f49787f5ecb3d605_200_200.jpg"/></p>
      <a href="https://keybase.io/aviaone">DCD3D6C0BF61C200</a></td>
    <td><a href="https://aviaone.com">https://aviaone.com</a></tr>
  <tr>
    <td><pre>Easy2Stake</pre></td>
    <td>Easy.Stake.Trust</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/64e2ff0c8b5bc90725be9acb11564705_200_200.jpg"/></p>
      <a href="https://keybase.io/easy2stake">2C877AC873132C91</a></td>
    <td><a href="https://www.easy2stake.com/">https://www.easy2stake.com/</a></tr>
  <tr>
    <td><pre> Lavender.Five Nodes 🐝</pre></td>
    <td>Fortifying crypto networks with Horcrux security, slash insurance, and open source contributions. Connect with us at https://linktr.ee/lavenderfive.</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/831756ce9a9a9e938788b766d3cc5305_200_200.jpg"/></p>
      <a href="https://keybase.io/lavenderfive">F87ADDB700C0CC94</a></td>
    <td><a href="https://www.lavenderfive.com/">https://www.lavenderfive.com/</a></tr>
  <tr>
    <td><pre>HoodRun</pre></td>
    <td>Discover and Unlock the HoodRun Advantage; We make the Staking Experience the fastest and safest</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/a1600c5650b26f850982dac401912305_200_200.jpg"/></p>
      <a href="https://keybase.io/hoodrun">D7F99CBB63FFFD9E</a></td>
    <td><a href="https://hoodrun.io">https://hoodrun.io</a></tr>
  <tr>
    <td><pre>2pilot</pre></td>
    <td>Your trusted staking co-pilot</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/5eaec55e16538f2ecf801b402a02e405_200_200.jpg"/></p>
      <a href="https://keybase.io/stanisla">8E102EA8D78D6769</a></td>
    <td><a href="https://2pilot.dev">https://2pilot.dev</a></tr>
  <tr>
    <td><pre>waynewayner</pre></td>
    <td></td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/dcbcf762cf976ffe7535176c6ca3c905_200_200.jpg"/></p>
      <a href="https://keybase.io/waynewayner">3D726987CB38C0D2</a></td>
    <td><a href="https://waynewayner.de">https://waynewayner.de</a></tr>
  <tr>
    <td><pre>Stake&amp;Relax 🦥</pre></td>
    <td>StakeandRelax to get Stake🥩&amp;Rolex⌚️Twitter:@StakeandRelax</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/90eb578503e113288eba22d396544f05_200_200.jpg"/></p>
      <a href="https://keybase.io/cryptocakir">BD90F7F27099E9E3</a></td>
    <td><a href="https://linktr.ee/stakeandrelax">https://linktr.ee/stakeandrelax</a></tr>
</table>
