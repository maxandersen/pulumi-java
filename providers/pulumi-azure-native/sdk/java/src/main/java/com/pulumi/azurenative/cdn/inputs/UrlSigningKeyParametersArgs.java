// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.inputs;

import com.pulumi.azurenative.cdn.inputs.ResourceReferenceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Url signing key parameters
 * 
 */
public final class UrlSigningKeyParametersArgs extends com.pulumi.resources.ResourceArgs {

    public static final UrlSigningKeyParametersArgs Empty = new UrlSigningKeyParametersArgs();

    /**
     * Defines the customer defined key Id. This id will exist in the incoming request to indicate the key used to form the hash.
     * 
     */
    @Import(name="keyId", required=true)
    private Output<String> keyId;

    public Output<String> keyId() {
        return this.keyId;
    }

    /**
     * Resource reference to the KV secret
     * 
     */
    @Import(name="secretSource", required=true)
    private Output<ResourceReferenceArgs> secretSource;

    public Output<ResourceReferenceArgs> secretSource() {
        return this.secretSource;
    }

    /**
     * Version of the secret to be used
     * 
     */
    @Import(name="secretVersion")
    private @Nullable Output<String> secretVersion;

    public Optional<Output<String>> secretVersion() {
        return Optional.ofNullable(this.secretVersion);
    }

    /**
     * The type of the Secret to create.
     * Expected value is &#39;UrlSigningKey&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    private UrlSigningKeyParametersArgs() {}

    private UrlSigningKeyParametersArgs(UrlSigningKeyParametersArgs $) {
        this.keyId = $.keyId;
        this.secretSource = $.secretSource;
        this.secretVersion = $.secretVersion;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UrlSigningKeyParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UrlSigningKeyParametersArgs $;

        public Builder() {
            $ = new UrlSigningKeyParametersArgs();
        }

        public Builder(UrlSigningKeyParametersArgs defaults) {
            $ = new UrlSigningKeyParametersArgs(Objects.requireNonNull(defaults));
        }

        public Builder keyId(Output<String> keyId) {
            $.keyId = keyId;
            return this;
        }

        public Builder keyId(String keyId) {
            return keyId(Output.of(keyId));
        }

        public Builder secretSource(Output<ResourceReferenceArgs> secretSource) {
            $.secretSource = secretSource;
            return this;
        }

        public Builder secretSource(ResourceReferenceArgs secretSource) {
            return secretSource(Output.of(secretSource));
        }

        public Builder secretVersion(@Nullable Output<String> secretVersion) {
            $.secretVersion = secretVersion;
            return this;
        }

        public Builder secretVersion(String secretVersion) {
            return secretVersion(Output.of(secretVersion));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public UrlSigningKeyParametersArgs build() {
            $.keyId = Objects.requireNonNull($.keyId, "expected parameter 'keyId' to be non-null");
            $.secretSource = Objects.requireNonNull($.secretSource, "expected parameter 'secretSource' to be non-null");
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
