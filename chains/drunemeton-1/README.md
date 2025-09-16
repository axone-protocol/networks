<!-- generated file - do not edit -->
# 🔗 `okp4-drunemeton-1`

![chain-id](https://img.shields.io/badge/chain%20id-okp4--drunemeton--1-blue?style=for-the-badge)
[![stability-deprecated](https://img.shields.io/badge/stability-deprecated-922b21.svg?style=for-the-badge)](https://github.com/mkenney/software-guides/blob/master/STABILITY-BADGES.md#deprecated)
![audience](https://img.shields.io/badge/audience-public-white.svg?style=for-the-badge)
![incentivized-✖️](https://img.shields.io/badge/incentivized-✖️-29220A.svg?style=for-the-badge)
![genesis-time](https://img.shields.io/badge/%E2%8F%B0%20genesis%20time-2024--02--06T15%3A00%3A00Z-red?style=for-the-badge)
![chain-height](https://img.shields.io/badge/dynamic/json?url=https%3A%2F%2Fapi.drunemeton.okp4.network%2Fcosmos%2Fbase%2Ftendermint%2Fv1beta1%2Fblocks%2Flatest&query=%24.block.header.height&style=for-the-badge&label=height&color=%231E2A4E&cacheSeconds=6)

> [!IMPORTANT]
> This network was discontinued on 2024-09-30.
<!-- -->
> [!IMPORTANT]
> This network was originally created under the former `OKP4` brand.

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
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/eb862730815b872a6e65db757f9d3e05_200_200.jpg"/></p>
      <a href="https://keybase.io/0a6af02d1557e5b4">0A6AF02D1557E5B4</a></td>
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
    <td><pre>Nodes.Guru</pre></td>
    <td>Guru of non-custodial staking. Professional node running, low fees, best uptime and 24/7 customer support.</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/25738b36b7972b94112bc8dc0df13b05_200_200.jpg"/></p>
      <a href="https://keybase.io/nodesguru">28B672FCE6BBD562</a></td>
    <td><a href="https://stake.nodes.guru">https://stake.nodes.guru</a></tr>
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
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/c5f0e5c3c88a6194da5277d3eb297805_200_200.jpg"/></p>
      <a href="https://keybase.io/lavenderfive">F87ADDB700C0CC94</a></td>
    <td><a href="https://www.lavenderfive.com/">https://www.lavenderfive.com/</a></tr>
  <tr>
    <td><pre>HashKey Cloud</pre></td>
    <td>Cloud for WEB3 More Than Staking</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/0a30469c4d49aa836b58cab6a59b9005_200_200.jpg"/></p>
      <a href="https://keybase.io/hashkeycloud">CB79CF86DBD56A19</a></td>
    <td><a href="https://www.hashkey.cloud/">https://www.hashkey.cloud/</a></tr>
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
  <tr>
    <td><pre>[NODERS]TEAM</pre></td>
    <td>Trusted blockchain validator and web3 developer team</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/a57832ea25adc993ce911f8e80acc805_200_200.jpg"/></p>
      <a href="https://keybase.io/nodersteam">220491ADDD660741</a></td>
    <td><a href="https://nodersteam.com">https://nodersteam.com</a></tr>
  <tr>
    <td><pre>Enigma</pre></td>
    <td>Highly secure professional validator across 35+ chains - offering a full refund for any downtime slashing - Reach out to us at contact@enigma-validator.com</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/2c2e5a59694817aaa8f8e1290518e505_200_200.jpg"/></p>
      <a href="https://keybase.io/enigmastaking">6223697ACA24A4FF</a></td>
    <td><a href="https://enigma-validator.com/">https://enigma-validator.com/</a></tr>
  <tr>
    <td><pre>Stakin</pre></td>
    <td>Reliable and Secure Staking Services Trusted by Institutions. ISO27001 certified, Cosmos ecosystem contributor, IBC relayer provider. Visit our website to know more about Stakin and for T&amp;Cs.</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/1c7c29dec05c920a99b42e114e732705_200_200.jpg"/></p>
      <a href="https://keybase.io/stakin">83D300CB42D06962</a></td>
    <td><a href="https://stakin.com">https://stakin.com</a></tr>
  <tr>
    <td><pre>Meria</pre></td>
    <td>Meria</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/3fcc4caebb2c8e949829a7b090be3805_200_200.jpg"/></p>
      <a href="https://keybase.io/meria">9A516A1CD4116BBF</a></td>
    <td><a href="https://meria.com">https://meria.com</a></tr>
  <tr>
    <td><pre>p2p-org</pre></td>
    <td>P2P Validator (P2P.org) - an early OKP4 contributor &amp; long-time Cosmos Ecosystem participant. Stake with us for a secure, reliable and simple service</td>
    <td></td>
    <td><a href="https://p2p.org">https://p2p.org</a></tr>
  <tr>
    <td><pre>Cros-nest</pre></td>
    <td>We operate state-of-the-art distributed and redundant validator and relayer infrastructure for Proof of Stake Blockchains.</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/4e8a6ee78ed698828e6c2baec569d305_200_200.jpg"/></p>
      <a href="https://keybase.io/cros_nest">5F1D6AC7EA588676</a></td>
    <td><a href="https://cros-nest.com">https://cros-nest.com</a></tr>
  <tr>
    <td><pre>nysa.network</pre></td>
    <td></td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/2d9056551af97b92f6c759c6af125905_200_200.jpg"/></p>
      <a href="https://keybase.io/nysa_network">F7E5A47BC1D9F95B</a></td>
    <td><a href="https://nysa.network">https://nysa.network</a></tr>
  <tr>
    <td><pre>Kahuna</pre></td>
    <td>We are Kahuna, we invest in and run Blockchain Infrastructure</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/561072998cfed9fbbed287cb762a1f05_200_200.jpg"/></p>
      <a href="https://keybase.io/kahunahq">496198D003A5A717</a></td>
    <td><a href="https://kahuna.network">https://kahuna.network</a></tr>
  <tr>
    <td><pre>Saxon</pre></td>
    <td>Saxon is a technology-driven advisory and investment firm that serves start-ups and institutions that operate within the Web3 &amp; cryptocurrency ecosystem</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/25b3916cb3f187f0dc80035d8ff50b05_200_200.jpg"/></p>
      <a href="https://keybase.io/saxonxyz">d358f6bf2e1b525d</a></td>
    <td><a href="https://saxon.xyz/">https://saxon.xyz/</a></tr>
  <tr>
    <td><pre>✅ CryptoCrew Validators</pre></td>
    <td>We power the interchain | ccvalidators.com</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/7f4b384472efeccffd7685227f698405_200_200.jpg"/></p>
      <a href="https://keybase.io/clemenscc">9AE70F9E3EDA8956</a></td>
    <td><a href="https://ccvalidators.com">https://ccvalidators.com</a></tr>
  <tr>
    <td><pre>TrustedPoint</pre></td>
    <td>TrustedPoint is a a staking provider for PoS blockchains. We do ensure reliability, security and decentralisation that are successfully backed by an experienced team, technically advanced community from all over the world as well as dependable hosting providers</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/4740fd90d19b2151dc001dbfea356b05_200_200.jpg"/></p>
      <a href="https://keybase.io/testnet_pride">D116AD27764E8C4E</a></td>
    <td><a href="https://trusted-point.com/">https://trusted-point.com/</a></tr>
  <tr>
    <td><pre>SG-1</pre></td>
    <td>SG-1</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/cd2a41a8df34c773128fa394f2acda05_200_200.jpg"/></p>
      <a href="https://keybase.io/sg_1">48608633F99D1B60</a></td>
    <td><a href="https://sg-1.online">https://sg-1.online</a></tr>
</table>
