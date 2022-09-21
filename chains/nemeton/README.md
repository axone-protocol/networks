# 🔗 `nemeton`

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

# Create the gentx
okp4d --home mynode gentx your-key-name 1000000uknow --node-id $(okp4d --home mynode tendermint show-node-id) --chain-id okp4-nemeton
```
