<!-- generated file - do not edit -->
# 🔗 `okp4-nemeton-1`

![chain-id](https://img.shields.io/badge/chain%20id-okp4--nemeton--1-blue?style=for-the-badge)
![stability-stable](https://img.shields.io/badge/stability-stable-green.svg?style=for-the-badge)
![audience](https://img.shields.io/badge/audience-public-white.svg?style=for-the-badge)
![genesis-time](https://img.shields.io/badge/%E2%8F%B0%20genesis%20time-2022--12--14T15%3A00%3A00Z-red?style=for-the-badge)

## Register in the Genesis

> ℹ️ **Registration is only open for Druids 🧙‍♂️**. See [Nemeton program](https://nemeton.okp4.network/).

To register your validator node in the `genesis.json` you just need to provide a signed `gentx` with an initial delegation of `10000000000uknow` in a [⚖️ Register Validator issue](https://github.com/okp4/networks/issues).

The gentx generation can be done as follow (this is an example script, adapt it to your needs) with the [okp4d](https://github.com/okp4/okp4d/releases) binary matching the [network's version](/chains/nemeton-1/version.txt):

```sh
# Init node
okp4d --home mynode init your-moniker --chain-id okp4-nemeton-1

# Create keys, be careful with the mnemonic 👀
okp4d --home mynode keys add your-key-name

# Set account necessary balance
okp4d --home mynode add-genesis-account your-key-name 10000200000uknow
```

Then create your own genesis transaction (`gentx`). You will have to choose the following parameters for your validator: `commission-rate`, `commission-max-rate`, `commission-max-change-rate`, `min-self-delegation` (>=1), `website` (optional), `details` (optional), `identity` ([keybase](https://keybase.io) key hash, used to get validator logos in block explorers - optional), `security-contact` (email - optional).

```sh
# Create the gentx
okp4d --home mynode gentx your-key-name 10000000000uknow \
  --node-id $(okp4d --home mynode tendermint show-node-id) \
  --chain-id okp4-nemeton-1 \
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
    <td><pre>Nodes.Guru</pre></td>
    <td>Guru of non-custodial staking. Professional node running, low fees, best uptime and 24/7 customer support.</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/25738b36b7972b94112bc8dc0df13b05_200_200.jpg"/></p>
      <a href="https://keybase.io/nodesguru">28B672FCE6BBD562</a></td>
    <td><a href="https://stake.nodes.guru">https://stake.nodes.guru</a></tr>
  <tr>
    <td><pre>BccNodes</pre></td>
    <td>Professionally managed institutional grade blockchain infrastructure provider.</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/cb1991a04b12a85b7988cad86c351e05_200_200.jpg"/></p>
      <a href="https://keybase.io/berkcan1">C5337EB8B55DFA0C</a></td>
    <td><a href="https://bccnodes.net/">https://bccnodes.net/</a></tr>
  <tr>
    <td><pre>kjnodes</pre></td>
    <td>Providing professional staking services with high performance and availability.</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/d6f1e63ac25d855dad5d1d5915988205_200_200.jpg"/></p>
      <a href="https://keybase.io/kjnodes">1C5ACD2EEF363C3A</a></td>
    <td><a href="http://kjnodes.com">http://kjnodes.com</a></tr>
  <tr>
    <td><pre>👋 79anvi 🍀</pre></td>
    <td>kind validator</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/483d642a7ebb1891a60f98cbd4820f05_200_200.jpg"/></p>
      <a href="https://keybase.io/79anvi">542DBC35E8363484</a></td>
    <td><a href="https://79anvi.com">https://79anvi.com</a></tr>
  <tr>
    <td><pre>High Stakes 🇨🇭</pre></td>
    <td>Swiss corporation expert in PoS validation🚀 Join our Community: Twitter @HighStakes_CH | Discord https://discord.gg/MtAc6peX</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/53b008f12f37e3ffa0dec3676d375a05_200_200.jpg"/></p>
      <a href="https://keybase.io/highstakes">2CB281A714F6133B</a></td>
    <td><a href="https://highstakes.ch">https://highstakes.ch</a></tr>
  <tr>
    <td><pre>Noderunners</pre></td>
    <td>Noderunners is a professional validator in POS networks.</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/cdad8b374bb99bfb2824e6aed9d5e105_200_200.jpg"/></p>
      <a href="https://keybase.io/noderunners">812E82D12FEA3493</a></td>
    <td><a href="http://noderunners.biz">http://noderunners.biz</a></tr>
  <tr>
    <td><pre>OnThePluto</pre></td>
    <td>Lives in Cosmos (100% safe)</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/29b5d51b196307b1576604c8e93b2805_200_200.jpg"/></p>
      <a href="https://keybase.io/rossoman">801B6CC31C2431D4</a></td>
    <td><a href="https://onthepluto.com">https://onthepluto.com</a></tr>
  <tr>
    <td><pre>Cros-nest</pre></td>
    <td>We operate state-of-the-art distributed and redundant validator and relayer infrastructure for Proof of Stake Blockchains.</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/4e8a6ee78ed698828e6c2baec569d305_200_200.jpg"/></p>
      <a href="https://keybase.io/cros_nest">5F1D6AC7EA588676</a></td>
    <td><a href="https://www.cros-nest.com">https://www.cros-nest.com</a></tr>
  <tr>
    <td><pre>ProNodes</pre></td>
    <td>Validator from the ProNodes team!</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/72310996413f79b2bfe43d14a5bf8105_200_200.jpg"/></p>
      <a href="https://keybase.io/pronodes">124CBEC3CD2726F1</a></td>
    <td><a href="https://t.me/pronodes">https://t.me/pronodes</a></tr>
  <tr>
    <td><pre>smartinvest</pre></td>
    <td>Smart Invest. Earn Fast</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/837ca255399da1f30e53ab46e7f91805_200_200.jpg"/></p>
      <a href="https://keybase.io/smartbenten">05816A0C61989C6E</a></td>
    <td><a href="https://smartinvest-explorer.xyz/">https://smartinvest-explorer.xyz/</a></tr>
  <tr>
    <td><pre>range</pre></td>
    <td>PoS Validator Range, Blockchain Enthusiast</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/b809a0be83139709f802c49358e9e105_200_200.jpg"/></p>
      <a href="https://keybase.io/mrraange">2DFF3E5FB4ACFE21</a></td>
    <td><a href="https://rangenodes.com">https://rangenodes.com</a></tr>
  <tr>
    <td><pre>pops</pre></td>
    <td></td>
    <td></td>
    <td></tr>
  <tr>
    <td><pre>StakeAngle</pre></td>
    <td>Non-custodial staking provider</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/f06e8318cfdbb2d31a6abcc2c991f605_200_200.jpg"/></p>
      <a href="https://keybase.io/stakeangle">0C2EBFF70582B725</a></td>
    <td><a href="https://stakeangle.com/">https://stakeangle.com/</a></tr>
  <tr>
    <td><pre>WeStaking</pre></td>
    <td></td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/37253b99a18b747414a8ef89db54b005_200_200.jpg"/></p>
      <a href="https://keybase.io/westaking">DA9C5AD3E308E426</a></td>
    <td><a href="https://www.westaking.io">https://www.westaking.io</a></tr>
  <tr>
    <td><pre>Validator.run</pre></td>
    <td>Validator.run provides trusted stake service with 100% refund on downtime slashing. Enterprise grade infrastructure. High end security and 24/7 monitoring.</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/81013bebd3eb4c403a55488012c67e05_200_200.jpg"/></p>
      <a href="https://keybase.io/ardapda">2CC4D67B2136C051</a></td>
    <td><a href="https://www.validator.run">https://www.validator.run</a></tr>
  <tr>
    <td><pre>bonded.zone ⚡</pre></td>
    <td>In Chain We Trust! ⛓️</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/455462872a43ab3cb70d8df26cb5d005_200_200.jpg"/></p>
      <a href="https://keybase.io/kosjakoff">FAB7A1AFA2DD6977</a></td>
    <td><a href="https://info.bonded.zone/">https://info.bonded.zone/</a></tr>
  <tr>
    <td><pre>Inter Blockchain Services</pre></td>
    <td>Inter Blockchain Services Dpos validator and Relayer of COSMOS ecosystem 🤗 #IBCGANG</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/369a9b563db44c8f42abfda63e701f05_200_200.jpg"/></p>
      <a href="https://keybase.io/ibsdotteam">27FD74457A21B020</a></td>
    <td><a href="https://ibs.team">https://ibs.team</a></tr>
  <tr>
    <td><pre>Lex_Prime</pre></td>
    <td>Darksiders Staking team validator</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/568870fb4219c6b955481af648922705_200_200.jpg"/></p>
      <a href="https://keybase.io/lex_prime">0A7562DD5E1432EF</a></td>
    <td><a href="https://t.me/darksiders_staking">https://t.me/darksiders_staking</a></tr>
  <tr>
    <td><pre>Nodes Squad</pre></td>
    <td>Validator by Nodes Squad Team</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/5f3e892877baaa2f1996c60408515905_200_200.jpg"/></p>
      <a href="https://keybase.io/id577">2CBCDC74B2FF41C7</a></td>
    <td><a href="https://nodessquad.com">https://nodessquad.com</a></tr>
  <tr>
    <td><pre>Army IDs</pre></td>
    <td>A Professional Validator of Various Blockchain Networks</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/79347343cf219ec11bb200b3855d7b05_200_200.jpg"/></p>
      <a href="https://keybase.io/armyids">ABE093F03831CBBA</a></td>
    <td><a href="https://armyids.com">https://armyids.com</a></tr>
  <tr>
    <td><pre>soragNode</pre></td>
    <td></td>
    <td></td>
    <td></tr>
  <tr>
    <td><pre>Haxxana</pre></td>
    <td>Haxxana okp4d Validator</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/0825af4cbeccfb6d3751cc1ffd7f5e05_200_200.jpg"/></p>
      <a href="https://keybase.io/haxxana">229038FB6DDE4BFE</a></td>
    <td><a href="https://contributiondao.com/">https://contributiondao.com/</a></tr>
  <tr>
    <td><pre>Chainlayer</pre></td>
    <td>Secure and reliable validator. TG: https://t.me/chainlayer</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/5bea053297f0462b29a7bc84fbb00905_200_200.jpg"/></p>
      <a href="https://keybase.io/chainlayer">AD3CDBC91802F94A</a></td>
    <td><a href="https://chainlayer.io">https://chainlayer.io</a></tr>
  <tr>
    <td><pre>DragonDev 🐉</pre></td>
    <td>Community pgrogrammers</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/2657b71b881a2ac0fe61501ffda31905_200_200.jpg"/></p>
      <a href="https://keybase.io/icodragon">E8A570F4F2771961</a></td>
    <td><a href="https://t.me/icodragondev">https://t.me/icodragondev</a></tr>
  <tr>
    <td><pre>SGTstake</pre></td>
    <td>SGTstake validator node</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/93f63f495b5848cf10e798b1702bdb05_200_200.jpg"/></p>
      <a href="https://keybase.io/adorid">19185C91586D50DC</a></td>
    <td><a href="https://sgtstake.com">https://sgtstake.com</a></tr>
  <tr>
    <td><pre>stakingcabin</pre></td>
    <td>StakingCabin</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/8640a01e358b50a04de28f41f4707f05_200_200.jpg"/></p>
      <a href="https://keybase.io/stakingcabin">C0522DF992B0C407</a></td>
    <td><a href="https://stakingcabin.com">https://stakingcabin.com</a></tr>
  <tr>
    <td><pre>longship-staking</pre></td>
    <td></td>
    <td></td>
    <td></tr>
  <tr>
    <td><pre>Kalia Network</pre></td>
    <td>Kalia Network validator node. Delegate your tokens and Start Earning Staking Rewards</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/b10c191914fa49558addc492955c8a05_200_200.jpg"/></p>
      <a href="https://keybase.io/kalianetwork">3D6E2861B47F2F9F</a></td>
    <td><a href="https://kalia.network">https://kalia.network</a></tr>
  <tr>
    <td><pre>Nodeist</pre></td>
    <td>Professional node running, best uptime, low fees. Discord: Nodeist#3299</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/e16ba5abb8e81fe864c1809c0f8e6c05_200_200.jpg"/></p>
      <a href="https://keybase.io/nodeistt">A2E180C6914F7F87</a></td>
    <td><a href="https://nodeist.net">https://nodeist.net</a></tr>
  <tr>
    <td><pre>ericet</pre></td>
    <td></td>
    <td></td>
    <td></tr>
  <tr>
    <td><pre>CryptoSailors</pre></td>
    <td>Team of professional validators with best digital solutions. Please visit our Telegram🔹https://t.me/CryptoSailorsAnn🔹</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/c5cfa2b3ab546153e25bd89465433e05_200_200.jpg"/></p>
      <a href="https://keybase.io/cryptosailors">8F292E79DCDEF143</a></td>
    <td><a href="https://cryptosailors.tech/">https://cryptosailors.tech/</a></tr>
  <tr>
    <td><pre>Nodejumper 🚀</pre></td>
    <td>Professional POS Validator services, Cosmos contributors and supporters, RESTAKE APP compatible</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/8506223c573a1bee45e9182de7684805_200_200.jpg"/></p>
      <a href="https://keybase.io/nodejumper">FFB0AA51A2DF5954</a></td>
    <td><a href="https://nodejumper.io">https://nodejumper.io</a></tr>
  <tr>
    <td><pre>Stakin</pre></td>
    <td></td>
    <td></td>
    <td></tr>
  <tr>
    <td><pre>StingRay</pre></td>
    <td>Reliable Proof-of-Stake Validator</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/ebeae97c33cd4b83ccf857043fb7bd05_200_200.jpg"/></p>
      <a href="https://keybase.io/mikhailr">D1A8193AF3905AAC</a></td>
    <td><a href="https://github.com/MikhailRadusha">https://github.com/MikhailRadusha</a></tr>
  <tr>
    <td><pre>oxes</pre></td>
    <td></td>
    <td></td>
    <td></tr>
  <tr>
    <td><pre>Stigga</pre></td>
    <td>Individual PoS validator in Cosmos Hub Ecosystem chains, Discord:alexmed#5188</td>
    <td></td>
    <td><a href="https://stigga.org/">https://stigga.org/</a></tr>
  <tr>
    <td><pre>UbiquitousNodes</pre></td>
    <td>UbiquitousNodes</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/d43780fd0eaf0e8f50e4170ad3354005_200_200.jpg"/></p>
      <a href="https://keybase.io/ubiquitousnodes">04FD06480ABBD0A9</a></td>
    <td><a href="http://ubiquitousnodes.com">http://ubiquitousnodes.com</a></tr>
  <tr>
    <td><pre>bulevar</pre></td>
    <td></td>
    <td></td>
    <td></tr>
  <tr>
    <td><pre>𝑵𝒐𝒅𝒆𝒔𝑩𝒍𝒐𝒄𝒌𝒔</pre></td>
    <td>𝑩𝑬𝑺𝑻 𝑩𝑳𝑶𝑪𝑲𝑺 𝑶𝑹 𝑵𝑶𝑻𝑯𝑰𝑵𝑮</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/e9aac9e605ef9e510d5a0f7716fbc505_200_200.jpg"/></p>
      <a href="https://keybase.io/nickkauffmann">5328563A4BD384C9</a></td>
    <td><a href="https://nodesblocks.dev">https://nodesblocks.dev</a></tr>
  <tr>
    <td><pre>stanislove</pre></td>
    <td>Available and reliable validator</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/5eaec55e16538f2ecf801b402a02e405_200_200.jpg"/></p>
      <a href="https://keybase.io/stanisla">8E102EA8D78D6769</a></td>
    <td><a href="https://github.com/stasjara">https://github.com/stasjara</a></tr>
  <tr>
    <td><pre>NodeXCapital</pre></td>
    <td>Hi, NodeX Capital is here! secure and reliable nodes validator. Discord : https://discord.gg/nodexcapital</td>
    <td></td>
    <td><a href="https://nodexcapital.com">https://nodexcapital.com</a></tr>
  <tr>
    <td><pre>punq</pre></td>
    <td>Lets Rock - 7/24 non-stop staking service</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/cc5852e8b1824bd018227982a06f8405_200_200.jpg"/></p>
      <a href="https://keybase.io/punq0">7CB303A615C2AC8F</a></td>
    <td><a href="https://www.punq.info">https://www.punq.info</a></tr>
  <tr>
    <td><pre>HitTheNails</pre></td>
    <td>Experienced validator, backend developer</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/539ae0246ebe80c25f8248489fa40005_200_200.jpg"/></p>
      <a href="https://keybase.io/ralymov">15CAB67917176AC7</a></td>
    <td><a href="https://alymov.dev">https://alymov.dev</a></tr>
  <tr>
    <td><pre>Kolot</pre></td>
    <td></td>
    <td></td>
    <td></tr>
  <tr>
    <td><pre>cryptech</pre></td>
    <td>Devops team from Ukraine</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/366d89bc67a6c764f0d62245447ee305_200_200.jpg"/></p>
      <a href="https://keybase.io/cryptechnodes">7E643213C757C9F2</a></td>
    <td><a href="https://cryptech.com.ua">https://cryptech.com.ua</a></tr>
  <tr>
    <td><pre>gulocrypto</pre></td>
    <td>gulocrypto validator</td>
    <td></td>
    <td><a href="https://t.me/gulo_research">https://t.me/gulo_research</a></tr>
  <tr>
    <td><pre>Moonlet</pre></td>
    <td></td>
    <td></td>
    <td></tr>
  <tr>
    <td><pre>nysa.network</pre></td>
    <td>Safe and Secure Proof of Stake Validator</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/2d9056551af97b92f6c759c6af125905_200_200.jpg"/></p>
      <a href="https://keybase.io/nysa_network">F7E5A47BC1D9F95B</a></td>
    <td><a href="https://nysa.network">https://nysa.network</a></tr>
  <tr>
    <td><pre>Anonstake</pre></td>
    <td>Our robust infrastructure helps to secure the networks we support</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/368df8f627654fe47838039f26060905_200_200.jpg"/></p>
      <a href="https://keybase.io/anonstake">FCAD12142E878B17</a></td>
    <td><a href="https://anonstake.com">https://anonstake.com</a></tr>
  <tr>
    <td><pre>AlxVoy</pre></td>
    <td>Cosmos one Love</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/a1654dda5b9cb96128bc5fe53ea18f05_200_200.jpg"/></p>
      <a href="https://keybase.io/alexvoy">ABE84D0AB09AB589</a></td>
    <td><a href="https://voynitskiy.com">https://voynitskiy.com</a></tr>
  <tr>
    <td><pre>𝐫𝐨𝐦𝐚𝐧✔︎𝟏𝟖𝟏𝟐</pre></td>
    <td>Individual staking service</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/e99f51f2c692312a85dda3a99bc60a05_200_200.jpg"/></p>
      <a href="https://keybase.io/romanv1812">12151B2C705E9865</a></td>
    <td><a href="https://github.com/romanv1812">https://github.com/romanv1812</a></tr>
  <tr>
    <td><pre>Bibbes21</pre></td>
    <td>Bibbes21</td>
    <td></td>
    <td></tr>
  <tr>
    <td><pre>✅ CryptoCrew Validators #IBCgang</pre></td>
    <td>CryptoCrew validator &amp; multi-chain IBC-relayer service for OKP4-TESTNET. Based in Europe. t.me/cryptocrew_validators</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/7f4b384472efeccffd7685227f698405_200_200.jpg"/></p>
      <a href="https://keybase.io/clemenscc">9AE70F9E3EDA8956</a></td>
    <td><a href="https://ccvalidators.com">https://ccvalidators.com</a></tr>
  <tr>
    <td><pre>STAKECRAFT</pre></td>
    <td>Trustworthy Validator</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/610d0216baa9890a212948ffb6592505_200_200.jpg"/></p>
      <a href="https://keybase.io/stakecraft">42BBD6183544D905</a></td>
    <td><a href="https://stakecraft.com">https://stakecraft.com</a></tr>
  <tr>
    <td><pre>bellatora</pre></td>
    <td>https://github.com/ibrahimarslann59</td>
    <td></td>
    <td><a href="https://bellatora.co">https://bellatora.co</a></tr>
  <tr>
    <td><pre>Seasting</pre></td>
    <td>One more Cosmonaut</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/2a5d271a2ff0fb752237ea27836c2505_200_200.jpg"/></p>
      <a href="https://keybase.io/zem88">1315C7A59CD38B62</a></td>
    <td><a href="https://seasting.xyz">https://seasting.xyz</a></tr>
  <tr>
    <td><pre>dmvrt</pre></td>
    <td>Indi Pos Validator</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/0b6547b45aac40da1cc682d067b5f405_200_200.jpg"/></p>
      <a href="https://keybase.io/dmvrt7">AB939C29F295B97A</a></td>
    <td><a href="https://linktr.ee/dmvrt">https://linktr.ee/dmvrt</a></tr>
  <tr>
    <td><pre>Cumulo</pre></td>
    <td></td>
    <td></td>
    <td></tr>
  <tr>
    <td><pre>Munris</pre></td>
    <td></td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/b6dfba221a0a4f4cb32f14ef4e3b3605_200_200.jpg"/></p>
      <a href="https://keybase.io/munris">E781A7FB7A3511B4</a></td>
    <td><a href="https://munris.tech">https://munris.tech</a></tr>
  <tr>
    <td><pre>tRDM</pre></td>
    <td>In Web3 we trust</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/b4a56371bddef54ac5f9184d90a30a05_200_200.jpg"/></p>
      <a href="https://keybase.io/trdm">A736F5012E6F594D</a></td>
    <td><a href="https://nodera.org">https://nodera.org</a></tr>
  <tr>
    <td><pre>seltonstake</pre></td>
    <td>Seltonstake is a community validator running on enterprise hardware</td>
    <td></td>
    <td></tr>
  <tr>
    <td><pre>CosmoBook</pre></td>
    <td>all about Cosmos | Ds: Aleksei#7906 | Tg: just_do_idea</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/2fc8a958d30e387f6867bfe287f3ea05_200_200.jpg"/></p>
      <a href="https://keybase.io/glukoss">BF4182F0720077D9</a></td>
    <td><a href="https://cosmobook.io">https://cosmobook.io</a></tr>
  <tr>
    <td><pre>Blockmachine</pre></td>
    <td>Cosmic Validator</td>
    <td></td>
    <td><a href="https://blockmachine.pro/">https://blockmachine.pro/</a></tr>
  <tr>
    <td><pre>lesnik | UTSA</pre></td>
    <td>Patience and a little effort!</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/20b05f5939d197b253a005b43d3c0105_200_200.jpg"/></p>
      <a href="https://keybase.io/lesnik_utsa">A0B5FF00B5460153</a></td>
    <td><a href="https://teletype.in/@lesnik13utsa">https://teletype.in/@lesnik13utsa</a></tr>
  <tr>
    <td><pre>BartestneT</pre></td>
    <td>YOU - stake on my validator, I - provide High Availability, Reliability, Disaster Recovery and of course timely Rewards</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/35a1374f136d70c14d2667419c75b405_200_200.jpg"/></p>
      <a href="https://keybase.io/bartosianet">7A5898F2CC077781</a></td>
    <td></tr>
  <tr>
    <td><pre>moodman</pre></td>
    <td>up</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/786272c2dbcc4885e33639a924a65c05_200_200.jpg"/></p>
      <a href="https://keybase.io/bobito25">AF0380BF5D4DE417</a></td>
    <td><a href="https://twitter.com/BorysLifeee">https://twitter.com/BorysLifeee</a></tr>
  <tr>
    <td><pre>PPNV</pre></td>
    <td></td>
    <td></td>
    <td></tr>
  <tr>
    <td><pre> AutoStake 🛡️ Slash Protected</pre></td>
    <td>Earn higher Yields with AutoStake.net 🛡️ 100% Refund on ALL forms of slashing backed by a SAFU fund 🛡️ IBC Relayer: ibc.autostake.net &amp; 💸Auto-REStake: wallet.autostake.net/evmos 💸 &amp; twitter.com/AutoStake_ &amp; telegram.me/AutoStake_net</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/051cdbd6d051d3cafcdb45377c6b5c05_200_200.jpg"/></p>
      <a href="https://keybase.io/autostake">4D3303E20A4D2C32</a></td>
    <td></tr>
  <tr>
    <td><pre>Swiss Staking</pre></td>
    <td>Never jailed. Perfect uptime. Airdrop eligibility. IBC relayer. Community contributor. Backing p-chains. High security approach.</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/ff6f58998b7612c5ff3c808aed1af005_200_200.jpg"/></p>
      <a href="https://keybase.io/swissstaking">165F85FC0194320D</a></td>
    <td><a href="https://swiss-staking.ch">https://swiss-staking.ch</a></tr>
  <tr>
    <td><pre>Selachi</pre></td>
    <td>Crypto passionate, aiming for success</td>
    <td></td>
    <td><a href="https://twitter.com/selachi667">https://twitter.com/selachi667</a></tr>
  <tr>
    <td><pre>MELLIFERA</pre></td>
    <td>MMELLIFERA validator. Honest guys from Ukraine 🇺🇦 </td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/e86fec4890dc435ba14cb684ab658e05_200_200.jpg"/></p>
      <a href="https://keybase.io/ruslanglaznyov">8F3D842B29B89CC5</a></td>
    <td><a href="https://mellifera.network/">https://mellifera.network/</a></tr>
  <tr>
    <td><pre>Enigma</pre></td>
    <td>Proof of Stake Validator on different projects -- Passionate about Data Science and Technology</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/b2bfc1afcfa172367bb858b2e50e6b05_200_200.jpg"/></p>
      <a href="https://keybase.io/enigmastaking">6223697ACA24A4FF</a></td>
    <td><a href="https://enigma-validator.com/">https://enigma-validator.com/</a></tr>
  <tr>
    <td><pre>[NODERS]TEAM</pre></td>
    <td></td>
    <td></td>
    <td></tr>
  <tr>
    <td><pre>Blockpower Capital</pre></td>
    <td>We are web 3.0 trusted validators and discerning investors focused on secure staking, enterprise grade infrastructures and high quality applications.</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/8888513d9793e14936de315195d18d05_200_200.jpg"/></p>
      <a href="https://keybase.io/blockpowercapita">DF1CDD6E03CCF372</a></td>
    <td><a href="https://blockpower.capital">https://blockpower.capital</a></tr>
  <tr>
    <td><pre>AVIAONE 🟢</pre></td>
    <td>Retain ownership of your tokens and earn money  with us 👍. Join the winner team 🏆 in the best safety conditions without any risk for your money</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/26cb2814f06d1832f49787f5ecb3d605_200_200.jpg"/></p>
      <a href="https://keybase.io/aviaone">DCD3D6C0BF61C200</a></td>
    <td><a href="https://aviaone.com">https://aviaone.com</a></tr>
  <tr>
    <td><pre>KJINC.io</pre></td>
    <td>BLOCKCHAIN INFRASTRUCTURE AND STAKING PARTNER BRING YOUR IDEA TO HIGHER LEVELS WITH KJINC.io</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/64d5f456f897f44e17a9ae613ff6b405_200_200.jpg"/></p>
      <a href="https://keybase.io/kjinc">E294DFEB5B016EE2</a></td>
    <td><a href="https://kjinc.io">https://kjinc.io</a></tr>
  <tr>
    <td><pre>silent</pre></td>
    <td>Silent is a professional validator who wanna bring value to cosmos community</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/e2c9828ccea11ee1b7e3af66ac132905_200_200.jpg"/></p>
      <a href="https://keybase.io/silentnoname">A47522A5527DB39F</a></td>
    <td><a href="https://silentvalidator.com">https://silentvalidator.com</a></tr>
  <tr>
    <td><pre>jayjay</pre></td>
    <td>Don&#39;t stop jayjay KNOW</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/273625e88af0407ae3a1134eca418a05_200_200.jpg"/></p>
      <a href="https://keybase.io/jayjayone">34589DAF06970635</a></td>
    <td><a href="https://twitter.com/javalry1">https://twitter.com/javalry1</a></tr>
  <tr>
    <td><pre>InfStones</pre></td>
    <td>InfStones. Web3 made easy.</td>
    <td></td>
    <td><a href="https://infstones.com/">https://infstones.com/</a></tr>
  <tr>
    <td><pre>CroutonDigital</pre></td>
    <td>CroutonDigital</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/0044c421a1346cd129363786cedb3405_200_200.jpg"/></p>
      <a href="https://keybase.io/croutonnodes">47B453B80ECFA342</a></td>
    <td><a href="https://t.me/croutoncrypto">https://t.me/croutoncrypto</a></tr>
  <tr>
    <td><pre>Niocrisnode</pre></td>
    <td>Niocrisnode</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/3b9f9839516914901030b69ca86a4505_200_200.jpg"/></p>
      <a href="https://keybase.io/niocris">F1122D1AAE9A5327</a></td>
    <td><a href="https://www.niocrisnode.com">https://www.niocrisnode.com</a></tr>
  <tr>
    <td><pre>Citadel.one</pre></td>
    <td>Citadel.one is a multi-asset non-custodial staking platform that lets anyone become a part of decentralized infrastructure and earn passive income. Stake with our nodes or any other validator across multiple networks in a few clicks</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/2826e38259411adafb416505fb948c05_200_200.jpg"/></p>
      <a href="https://keybase.io/citadeldao">EBB03EB4BB4CFCA7</a></td>
    <td><a href="https://citadel.one">https://citadel.one</a></tr>
  <tr>
    <td><pre>SmartHamster</pre></td>
    <td>Smart Hamster Nodes Studio</td>
    <td></td>
    <td><a href="https://smarthamster.tech">https://smarthamster.tech</a></tr>
  <tr>
    <td><pre>Imperator.co</pre></td>
    <td>100% refund on downtime slashing -- Professional Delegated Proof-of-Stake Network Validator</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/1855362ac6629cbc7158012eb363e405_200_200.jpg"/></p>
      <a href="https://keybase.io/ximperator">0878BA6BE556C132</a></td>
    <td><a href="https://imperator.co/">https://imperator.co/</a></tr>
  <tr>
    <td><pre>Nodeworks</pre></td>
    <td>NodeWorks</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/b111fee03262ee516b02455a6e7e1605_200_200.jpg"/></p>
      <a href="https://keybase.io/guruprasathn">DA12B2781FA24283</a></td>
    <td><a href="https://node.works/">https://node.works/</a></tr>
  <tr>
    <td><pre>Coinstamp</pre></td>
    <td>linktr.ee/coinstamp</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/9ead54d47f593ff6134e57e72d6d9305_200_200.jpg"/></p>
      <a href="https://keybase.io/coinstamp">DC593D952394A19A</a></td>
    <td><a href="https://coinstamp.me/">https://coinstamp.me/</a></tr>
  <tr>
    <td><pre>Decloud Nodes Lab</pre></td>
    <td>Powered on Akash Network!</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/7a1e4d5ab3fb4392601881a96f8b4d05_200_200.jpg"/></p>
      <a href="https://keybase.io/dimokus">86C945B6D5F526E6</a></td>
    <td><a href="https://akash.network/">https://akash.network/</a></tr>
  <tr>
    <td><pre>cyberG</pre></td>
    <td>#IBCGANG</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/549617425032faf3a1ead25f6b8a8605_200_200.jpg"/></p>
      <a href="https://keybase.io/cyberg88">1DA7F229F22EA5D6</a></td>
    <td><a href="https://www.cyberg.digital">https://www.cyberg.digital</a></tr>
  <tr>
    <td><pre>Stake&amp;Relax</pre></td>
    <td>StakeandRelax to get Stake🥩&amp;Rolex⌚️Twitter:@StakeandRelax</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/90eb578503e113288eba22d396544f05_200_200.jpg"/></p>
      <a href="https://keybase.io/cryptocakir">BD90F7F27099E9E3</a></td>
    <td><a href="https://linktr.ee/stakeandrelax">https://linktr.ee/stakeandrelax</a></tr>
  <tr>
    <td><pre>kukisglobal</pre></td>
    <td>Kukis Global</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/41fca6722b562821e1ed1c3e8ce45505_200_200.jpg"/></p>
      <a href="https://keybase.io/kukisglobal">BF72882C34053737</a></td>
    <td><a href="https://kukis-global.com">https://kukis-global.com</a></tr>
  <tr>
    <td><pre>swiftstaking</pre></td>
    <td>swiftstaking</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/5c01d89648c693c831cb181774b28e05_200_200.jpg"/></p>
      <a href="https://keybase.io/swiftstaking">B98ACE8628D71DD4</a></td>
    <td><a href="https://swiftstaking.com">https://swiftstaking.com</a></tr>
  <tr>
    <td><pre>talhab62</pre></td>
    <td></td>
    <td></td>
    <td><a href="https://b62.io">https://b62.io</a></tr>
  <tr>
    <td><pre>HashQuark</pre></td>
    <td>Staking Made Easier</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/eb44422b288e72460f30bf5bc6d6e805_200_200.jpg"/></p>
      <a href="https://keybase.io/hashquark">31AFBBE0A52FA1ED</a></td>
    <td><a href="https://www.hashquark.io">https://www.hashquark.io</a></tr>
  <tr>
    <td><pre>P2P.ORG Validator</pre></td>
    <td>One of the winners of Cosmos Game of Stakes. We provide a simple, secure and intelligent staking service to help you generate rewards on your blockchain assets across 9+ networks within a single interface. Let&#39;s stake together - p2p.org.</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/0e54d989cbe0b1eed716e222bf2cdd05_200_200.jpg"/></p>
      <a href="https://keybase.io/p2p_org_">E12F4695036D8072</a></td>
    <td><a href="https://p2p.org">https://p2p.org</a></tr>
  <tr>
    <td><pre>BwareLabs</pre></td>
    <td>Guaranteed availability and up-time backed by a professional blockchain infrastructure team.</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/a7d03c9b2155a6821070eeecb4c24705_200_200.jpg"/></p>
      <a href="https://keybase.io/bwarelabs">E83A08BEEE7A70BD</a></td>
    <td><a href="https://bwarelabs.com">https://bwarelabs.com</a></tr>
  <tr>
    <td><pre>Nodiums</pre></td>
    <td>Nodiums</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/7baa911b3f922fd62c86f98077f59b05_200_200.jpg"/></p>
      <a href="https://keybase.io/nodiums">279A0D50E36D67F1</a></td>
    <td><a href="https://nodiums.com">https://nodiums.com</a></tr>
  <tr>
    <td><pre>cryptolife</pre></td>
    <td></td>
    <td></td>
    <td></tr>
  <tr>
    <td><pre>MinatoFund</pre></td>
    <td>MinatoFund Validator</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/7b7638bb06588c516e18a03224e40505_200_200.jpg"/></p>
      <a href="https://keybase.io/minatofund">D451DD9F8948A133</a></td>
    <td><a href="https://minatofund.com/">https://minatofund.com/</a></tr>
  <tr>
    <td><pre>kallen</pre></td>
    <td>I��m Binance Angel and former software engineer with a focus on analytics</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/7aed74c3f026858df81aa2d4d9fc5c05_200_200.jpg"/></p>
      <a href="https://keybase.io/kallenn">CBDB7BD6F3C7A207</a></td>
    <td><a href="https://kallen.cc/">https://kallen.cc/</a></tr>
  <tr>
    <td><pre>polkachu.com</pre></td>
    <td>Polkachu is the trusted staking service provider for blockchain projects. 100% refund for downtime slash. Contact us at hello@polkachu.com</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/d56ce0bdda17f73d4aa895d1626e2505_200_200.jpg"/></p>
      <a href="https://keybase.io/polkachu">0A6AF02D1557E5B4</a></td>
    <td><a href="https://polkachu.com">https://polkachu.com</a></tr>
  <tr>
    <td><pre>waynewayner</pre></td>
    <td>:P</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/dcbcf762cf976ffe7535176c6ca3c905_200_200.jpg"/></p>
      <a href="https://keybase.io/waynewayner">3D726987CB38C0D2</a></td>
    <td></tr>
  <tr>
    <td><pre>Syd</pre></td>
    <td>Just a learning Cat</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/6bacf672412da92f585d79dadc148605_200_200.jpg"/></p>
      <a href="https://keybase.io/sydy">974A77A1D5936626</a></td>
    <td></tr>
  <tr>
    <td><pre>Craving_for_Knowledge</pre></td>
    <td></td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/54d2cdb3e2e446e0baa3bda58d081205_200_200.jpg"/></p>
      <a href="https://keybase.io/zoiaruqueen">2BDE869A68CE9098</a></td>
    <td></tr>
  <tr>
    <td><pre>NodeStake</pre></td>
    <td>NodeStake is the professional Validator and IBC Relayer.⚛️7*24h | https://twitter.com/Nodestake_top</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/5912a329316356b98611c807d0c11e05_200_200.jpg"/></p>
      <a href="https://keybase.io/nodestake">94EFE192B2C52424</a></td>
    <td><a href="https://nodestake.top">https://nodestake.top</a></tr>
  <tr>
    <td><pre>metastackdata</pre></td>
    <td></td>
    <td></td>
    <td><a href="https://www.metastackdata.com">https://www.metastackdata.com</a></tr>
  <tr>
    <td><pre>gunu-node</pre></td>
    <td>gunu-node</td>
    <td></td>
    <td><a href="https://www.gunu-node.com">https://www.gunu-node.com</a></tr>
  <tr>
    <td><pre>Darvin</pre></td>
    <td>Secure and reliable PoS/PoW validator, Full-Stack Engineer, crypto enthusiast. 24hr management &amp; monitoring!</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/e509d5721acba4c257c52ffbf78fbf05_200_200.jpg"/></p>
      <a href="https://keybase.io/darvin002">3BEB84F14CEDA03C</a></td>
    <td><a href="https://www.linkedin.com/in/danil-poznyakov-859194184/">https://www.linkedin.com/in/danil-poznyakov-859194184/</a></tr>
  <tr>
    <td><pre>Informal Systems</pre></td>
    <td>Informal Systems x Cephalopod Equipment - infrastructure for decentralized intelligence</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/3a6087c347a6ee0d02f82b4fe2081f05_200_200.jpg"/></p>
      <a href="https://keybase.io/cephalopod_equip">6408AA029ADBE364</a></td>
    <td><a href="https://informal.systems">https://informal.systems</a></tr>
  <tr>
    <td><pre>Moloch88</pre></td>
    <td></td>
    <td></td>
    <td></tr>
  <tr>
    <td><pre>SerGo</pre></td>
    <td>Improve decentralization! Delegate to independent &amp; experienced validator.</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/cd8f93d411033d0d08f463906f245405_200_200.jpg"/></p>
      <a href="https://keybase.io/crazysergo">B3B62EB8C84738B9</a></td>
    <td><a href="https://foo.network">https://foo.network</a></tr>
  <tr>
    <td><pre>B-Harvest</pre></td>
    <td>Provides secure validation services for dPoS networks</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/3d5a3bd02e0c30db7949a371bbc4d705_200_200.jpg"/></p>
      <a href="https://keybase.io/bharvest">8957C5091FBF4192</a></td>
    <td><a href="https://bharvest.io">https://bharvest.io</a></tr>
  <tr>
    <td><pre>Apollo</pre></td>
    <td>Blockchain enthusiast and independent validator</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/faf34aa3fc646bc1571b1399f580ec05_200_200.jpg"/></p>
      <a href="https://keybase.io/zelivsky">6E2F84CACB2817CD</a></td>
    <td><a href="http://apollo-validator.space/">http://apollo-validator.space/</a></tr>
  <tr>
    <td><pre>Stake-Take</pre></td>
    <td> Trustworthy and high performance validators. Stake with us and Take profit 🚀 </td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/312f94d44d65bcffafe0d5f2c71a2d05_200_200.jpg"/></p>
      <a href="https://keybase.io/aleksandr7794">4A1DED53D477793B</a></td>
    <td><a href="https://stake-take.com/">https://stake-take.com/</a></tr>
  <tr>
    <td><pre>Huginn</pre></td>
    <td>Professional staking service. 7/24 monitoring and best uptime. Huginn is an organization that aims to teach its community about Cosmos SDK and Blockchain</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/c20e27856787fd5d28af6fbed15f4305_200_200.jpg"/></p>
      <a href="https://keybase.io/huginn_academy">D27EE330254D4F6A</a></td>
    <td><a href="https://huginn.tech">https://huginn.tech</a></tr>
  <tr>
    <td><pre>node75&amp;pro-nodes</pre></td>
    <td>Trusted validator in Web3 world</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/27dc4ea879b1194fc148d1da76d2ef05_200_200.jpg"/></p>
      <a href="https://keybase.io/node75">4B9AB6A7C275E32A</a></td>
    <td><a href="https://node75.org">https://node75.org</a></tr>
  <tr>
    <td><pre>Notional</pre></td>
    <td>Open Source, Organic edge validation and relaying. See more at: https://notional.ventures/ and https://github.com/notional-labs/notional</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/6ce44a0b3bbd2a99933ccb10a4a46305_200_200.jpg"/></p>
      <a href="https://keybase.io/notional">0E480E2B83B23D80</a></td>
    <td><a href="https://notional.ventures">https://notional.ventures</a></tr>
  <tr>
    <td><pre>Oni</pre></td>
    <td>The Oni Protectorate ⚛️ Validator for the Cosmos. Friend to the Cosmonaut.</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/a0696b953ceca5ca4fa36f3b00e91705_200_200.jpg"/></p>
      <a href="https://keybase.io/onivalidator">5A8AB49CF5CAAF3C</a></td>
    <td><a href="https://onivalidator.com">https://onivalidator.com</a></tr>
  <tr>
    <td><pre>fuckermaker</pre></td>
    <td></td>
    <td></td>
    <td></tr>
  <tr>
    <td><pre>AmberGroup</pre></td>
    <td>Amber is building the future of digital assets</td>
    <td></td>
    <td><a href="https://www.ambergroup.io">https://www.ambergroup.io</a></tr>
  <tr>
    <td><pre>WojaK</pre></td>
    <td>Always forward with WojaK</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/b53729f8133576192f3e62104b7b9205_200_200.jpg"/></p>
      <a href="https://keybase.io/deepcoinelmir">8579074E599379E0</a></td>
    <td><a href="https://wojakvalidator.com">https://wojakvalidator.com</a></tr>
  <tr>
    <td><pre>Vixello</pre></td>
    <td>Validating The Trustless</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/8f0c38c2d3636b891e2ae181baa39505_200_200.jpg"/></p>
      <a href="https://keybase.io/vixello">042979AB37056663</a></td>
    <td><a href="https://vixello.com">https://vixello.com</a></tr>
  <tr>
    <td><pre>Testnetrun</pre></td>
    <td>Best uptime, securely and non-custodial staking. Professional staking service, easily stake your assets with Testnetrun</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/c66c47b4e621cbd629e22a36ec464f05_200_200.jpg"/></p>
      <a href="https://keybase.io/testnetrun">5BC1A39569FEEE32</a></td>
    <td><a href="https://stake.testnet.run">https://stake.testnet.run</a></tr>
  <tr>
    <td><pre>Okaliptus</pre></td>
    <td>Node Runner</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/47027faf00493c4e00e26771c6460c05_200_200.jpg"/></p>
      <a href="https://keybase.io/okaliptus">94511F37C9EB0F69</a></td>
    <td><a href="https://github.com/Oxumare">https://github.com/Oxumare</a></tr>
  <tr>
    <td><pre>NodesWizard</pre></td>
    <td>Professional Node Team / Turkish community helper and Content Creator</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/46a37c08b0441d298e320d37134cbb05_200_200.jpg"/></p>
      <a href="https://keybase.io/nodeswizard">B7602CF262EDCD35</a></td>
    <td><a href="https://www.nodeswizard.com">https://www.nodeswizard.com</a></tr>
  <tr>
    <td><pre>MagicTeam</pre></td>
    <td>All the magicians of the universe will work to ensure that your profits increase steadily.</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/f17a8e20b74376d597cbc6a25af22a05_200_200.jpg"/></p>
      <a href="https://keybase.io/dimbirch">A1870F3349CDCCFF</a></td>
    <td><a href="https://www.magicnodes.team">https://www.magicnodes.team</a></tr>
  <tr>
    <td><pre>𝕍𝕒𝕘𝕚𝕗</pre></td>
    <td>True Crypto Enthusiast</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/b7f719145e00d800691b5994d06c3a05_200_200.jpg"/></p>
      <a href="https://keybase.io/vagif">E1E5CD63948A7272</a></td>
    <td><a href="https://vagif.pro">https://vagif.pro</a></tr>
  <tr>
    <td><pre>merve</pre></td>
    <td>“https://twitter.com/0x_MQuiNN   --identity=8969CC3423785030”</td>
    <td></td>
    <td><a href="https://twitter.com/0x_MQuiNN">https://twitter.com/0x_MQuiNN</a></tr>
  <tr>
    <td><pre>CaptainFantastic</pre></td>
    <td>LossNode Team member | node runner</td>
    <td></td>
    <td><a href="https://lossnode.info">https://lossnode.info</a></tr>
  <tr>
    <td><pre>ANAMIX</pre></td>
    <td>ANAMIX</td>
    <td></td>
    <td><a href="https://anamix.top">https://anamix.top</a></tr>
  <tr>
    <td><pre>lets_node</pre></td>
    <td>Let&#39;s Node validator</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/033726bf1770119236ecab2376a08405_200_200.jpg"/></p>
      <a href="https://keybase.io/sky_man">890C650CC73DA80D</a></td>
    <td><a href="https://t.me/letskynode">https://t.me/letskynode</a></tr>
  <tr>
    <td><pre>StakeLab</pre></td>
    <td>Staking and Relaying Hub for Cosmos ecosystem</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/63585765d299338807f158d6aadd2e05_200_200.jpg"/></p>
      <a href="https://keybase.io/stakelab">F12B081334CBE0C6</a></td>
    <td><a href="https://www.stakelab.fr">https://www.stakelab.fr</a></tr>
  <tr>
    <td><pre>zenscape</pre></td>
    <td>Enterprise-grade level infrastructure for DeFi degens to stake their crypto assets and earn yields on it. Eat, Sleep, Stake, Repeat!</td>
    <td>
      <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/7422803e583735db284898cafd8e8605_200_200.jpg"/></p>
      <a href="https://keybase.io/zenscape">F10E3CDCBC4EA7AA</a></td>
    <td><a href="https://zenscape.ome">https://zenscape.ome</a></tr>
</table>
