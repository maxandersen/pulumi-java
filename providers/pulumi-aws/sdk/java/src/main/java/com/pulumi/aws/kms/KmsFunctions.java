// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kms;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.kms.inputs.GetAliasArgs;
import com.pulumi.aws.kms.inputs.GetCipherTextArgs;
import com.pulumi.aws.kms.inputs.GetKeyArgs;
import com.pulumi.aws.kms.inputs.GetPublicKeyArgs;
import com.pulumi.aws.kms.inputs.GetSecretArgs;
import com.pulumi.aws.kms.inputs.GetSecretsArgs;
import com.pulumi.aws.kms.outputs.GetAliasResult;
import com.pulumi.aws.kms.outputs.GetCipherTextResult;
import com.pulumi.aws.kms.outputs.GetKeyResult;
import com.pulumi.aws.kms.outputs.GetPublicKeyResult;
import com.pulumi.aws.kms.outputs.GetSecretResult;
import com.pulumi.aws.kms.outputs.GetSecretsResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class KmsFunctions {
    /**
     * Use this data source to get the ARN of a KMS key alias.
     * By using this data source, you can reference key alias
     * without having to hard code the ARN as input.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetAliasResult> getAlias(GetAliasArgs args) {
        return getAlias(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetAliasResult> getAlias(GetAliasArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:kms/getAlias:getAlias", TypeShape.of(GetAliasResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The KMS ciphertext data source allows you to encrypt plaintext into ciphertext
     * by using an AWS KMS customer master key. The value returned by this data source
     * changes every apply. For a stable ciphertext value, see the `aws.kms.Ciphertext`
     * resource.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetCipherTextResult> getCipherText(GetCipherTextArgs args) {
        return getCipherText(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetCipherTextResult> getCipherText(GetCipherTextArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:kms/getCipherText:getCipherText", TypeShape.of(GetCipherTextResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get detailed information about
     * the specified KMS Key with flexible key id input.
     * This can be useful to reference key alias
     * without having to hard code the ARN as input.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetKeyResult> getKey(GetKeyArgs args) {
        return getKey(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetKeyResult> getKey(GetKeyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:kms/getKey:getKey", TypeShape.of(GetKeyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get the public key about the specified KMS Key with flexible key id input. This can be useful to reference key alias without having to hard code the ARN as input.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetPublicKeyResult> getPublicKey(GetPublicKeyArgs args) {
        return getPublicKey(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetPublicKeyResult> getPublicKey(GetPublicKeyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:kms/getPublicKey:getPublicKey", TypeShape.of(GetPublicKeyResult.class), args, Utilities.withVersion(options));
    }
    public static CompletableFuture<GetSecretResult> getSecret(GetSecretArgs args) {
        return getSecret(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetSecretResult> getSecret(GetSecretArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:kms/getSecret:getSecret", TypeShape.of(GetSecretResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Decrypt multiple secrets from data encrypted with the AWS KMS service.
     * 
     */
    public static CompletableFuture<GetSecretsResult> getSecrets(GetSecretsArgs args) {
        return getSecrets(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetSecretsResult> getSecrets(GetSecretsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:kms/getSecrets:getSecrets", TypeShape.of(GetSecretsResult.class), args, Utilities.withVersion(options));
    }
}
