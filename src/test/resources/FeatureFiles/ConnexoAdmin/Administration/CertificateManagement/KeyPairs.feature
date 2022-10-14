## Author: Dileep.Mothe@Honeywell.com
## Date: 20th Sept 2022
## Reference: Existing framework "KeypairsTest.java"

Feature: Validate the keyPairs functionality in Connexo Admin

Scenario: Validate keyPairs CRUD operations in Connexo Admin
 
Given HOME: I navigate to Connexo application
And LOGIN: I do login with root user
Then HOME: I should be on the Connexo dashboard page
And HOME: I navigate to Admin Module
And ADMIN-KEYPAIRS: I click on Keypairs links 
And ADMIN-KEYPAIRS: I Generate a New Key pair with below details:
|Name          |ABC        |
|StorageMethod |DataVault  |
|KeyType       |RSA 4096   |
Then ADMIN-KEYPAIRS: I verify that Generate Keypair "Add" Message
And ADMIN-KEYPAIRS: I download newly created publicKey
And ADMIN-KEYPAIRS: I remove newly created public Key
Then ADMIN-KEYPAIRS: I verify that Generate Keypair "Remove" Message