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
</table>
