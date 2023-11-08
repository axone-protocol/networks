<!-- generated file - do not edit -->
# 🔗 `okp4-nemeton`

![chain-id](https://img.shields.io/badge/chain%20id-okp4--nemeton-blue?style=for-the-badge)
![stability-discontinued](https://img.shields.io/badge/stability-discontinued%20🔚-lightgray.svg?style=for-the-badge)
![audience](https://img.shields.io/badge/audience-public-white.svg?style=for-the-badge)
![genesis-time](https://img.shields.io/badge/%E2%8F%B0%20genesis%20time-2022--10--17T13%3A00%3A00Z-red?style=for-the-badge)
![nb-validators](https://img.shields.io/badge/%F0%9F%A7%91%E2%80%8D%E2%9A%96%EF%B8%8F%20core%20validators-10-brightgreen?style=for-the-badge)

> :warning: **This chain was stopped on 30/12/22**. The active testnet is: [nemeton-1](../nemeton-1/README.md).

## Register in the Genesis

To register your validator node in the `genesis.json` you just need to provide a signed `gentx` in a [⚖️ Register Validator issue](https://github.com/okp4/networks/issues).

You *don't* have to fork the project and make the changes in the genesis yourself. Everything will be managed by the CI!

The gentx generation can be done as follow (this is an example script, adapt it to your needs) with the [okp4d](https://github.com/okp4/okp4d/releases) binary matching the [network's version](/chains/nemeton/version.txt):

```sh
# Init node
okp4d --home mynode init your-moniker

# Create keys, be careful with the mnemonic 👀
okp4d --home mynode keys add your-key-name

# Set account necessary balance
okp4d --home mynode add-genesis-account your-key-name 1200000uknow
```

Then create your own genesis transaction (`gentx`). You will have to choose the following parameters for your validator: `commission-rate`, `commission-max-rate`, `commission-max-change-rate`, `min-self-delegation` (>=1), `website` (optional), `details` (optional), `identity` ([keybase](https://keybase.io) key hash, used to get validator logos in block explorers - optional), `security-contact` (email - optional).

```sh
# Create the gentx
okp4d --home mynode gentx your-key-name 1000000uknow \
  --node-id $(okp4d --home mynode tendermint show-node-id) \
  --chain-id okp4-nemeton \
  --commission-rate 0.05 \
  --commission-max-rate 0.2 \
  --commission-max-change-rate 0.01 \
  --min-self-delegation 1
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
   <td><pre>✅ CryptoCrew Validators #IBCgang</pre></td>
   <td>CryptoCrew validator &amp; multi-chain IBC-relayer service for OKP4. Based in Europe. t.me/cryptocrew_validators</td>
   <td>
     <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/7f4b384472efeccffd7685227f698405_200_200.jpg"/></p>
     <a href="https://keybase.io/clemenscc">9AE70F9E3EDA8956</a></td>
   <td><a href="https://ccvalidators.com">https://ccvalidators.com</a></tr>
  <tr>
   <td><pre>nysa.network</pre></td>
   <td></td>
   <td></td>
   <td></tr>
  <tr>
   <td><pre>polkachu.com</pre></td>
   <td>Polkachu is the trusted staking service provider for blockchain projects. 100% refund for downtime slash. Contact us at hello@polkachu.com</td>
   <td>
     <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/d56ce0bdda17f73d4aa895d1626e2505_200_200.jpg"/></p>
     <a href="https://keybase.io/polkachu">0A6AF02D1557E5B4</a></td>
   <td><a href="https://polkachu.com">https://polkachu.com</a></tr>
  <tr>
   <td><pre>Cros-nest</pre></td>
   <td>We operate state-of-the-art distributed and redundant validator and relayer infrastructure for Proof of Stake Blockchains.</td>
   <td>
     <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/4e8a6ee78ed698828e6c2baec569d305_200_200.jpg"/></p>
     <a href="https://keybase.io/cros_nest">5F1D6AC7EA588676</a></td>
   <td><a href="https://www.cros-nest.com">https://www.cros-nest.com</a></tr>
  <tr>
   <td><pre>StakeLab</pre></td>
   <td>Staking Hub for Cosmos ecosystem</td>
   <td>
     <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/63585765d299338807f158d6aadd2e05_200_200.jpg"/></p>
     <a href="https://keybase.io/stakelab">F12B081334CBE0C6</a></td>
   <td><a href="https://www.stakelab.fr">https://www.stakelab.fr</a></tr>
  <tr>
   <td><pre>Chainlayer</pre></td>
   <td>Secure and reliable validator. TG: https://t.me/chainlayer</td>
   <td>
     <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/5bea053297f0462b29a7bc84fbb00905_200_200.jpg"/></p>
     <a href="https://keybase.io/chainlayer">AD3CDBC91802F94A</a></td>
   <td><a href="https://chainlayer.io">https://chainlayer.io</a></tr>
  <tr>
   <td><pre>NodeStake</pre></td>
   <td>NodeStake is the professional Validator and IBC Relayer.⚛️7*24h | https://twitter.com/Nodestake_top</td>
   <td>
     <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/5912a329316356b98611c807d0c11e05_200_200.jpg"/></p>
     <a href="https://keybase.io/nodestake">94EFE192B2C52424</a></td>
   <td><a href="https://nodestake.top">https://nodestake.top</a></tr>
  <tr>
   <td><pre>Imperator.co</pre></td>
   <td>100% refund on downtime slashing -- Professional Delegated Proof-of-Stake Network Validator</td>
   <td>
     <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/1855362ac6629cbc7158012eb363e405_200_200.jpg"/></p>
     <a href="https://keybase.io/ximperator">0878BA6BE556C132</a></td>
   <td><a href="https://imperator.co/">https://imperator.co/</a></tr>
  <tr>
   <td><pre>Testnetrun</pre></td>
   <td>Best uptime, securly and non-custodial staking. Professional staking service, easily stake your assets with Testnetrun</td>
   <td>
     <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/c66c47b4e621cbd629e22a36ec464f05_200_200.jpg"/></p>
     <a href="https://keybase.io/testnetrun">5BC1A39569FEEE32</a></td>
   <td><a href="https://stake.testnet.run">https://stake.testnet.run</a></tr>
  <tr>
   <td><pre>Notional</pre></td>
   <td>Open Source, Organic edge validation and relaying. See more at: https://notional.ventures/ and https://github.com/notional-labs/notional</td>
   <td>
     <p align="center"><img width="80px" src="https://s3.amazonaws.com/keybase_processed_uploads/6ce44a0b3bbd2a99933ccb10a4a46305_200_200.jpg"/></p>
     <a href="https://keybase.io/notional">0E480E2B83B23D80</a></td>
   <td><a href="https://notional.ventures">https://notional.ventures</a></tr>
</table>
