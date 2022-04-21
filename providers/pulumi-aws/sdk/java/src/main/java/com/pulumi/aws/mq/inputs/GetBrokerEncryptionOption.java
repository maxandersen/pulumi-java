// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.mq.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class GetBrokerEncryptionOption extends com.pulumi.resources.InvokeArgs {

    public static final GetBrokerEncryptionOption Empty = new GetBrokerEncryptionOption();

    @Import(name="kmsKeyId", required=true)
    private String kmsKeyId;

    public String kmsKeyId() {
        return this.kmsKeyId;
    }

    @Import(name="useAwsOwnedKey", required=true)
    private Boolean useAwsOwnedKey;

    public Boolean useAwsOwnedKey() {
        return this.useAwsOwnedKey;
    }

    private GetBrokerEncryptionOption() {}

    private GetBrokerEncryptionOption(GetBrokerEncryptionOption $) {
        this.kmsKeyId = $.kmsKeyId;
        this.useAwsOwnedKey = $.useAwsOwnedKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBrokerEncryptionOption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBrokerEncryptionOption $;

        public Builder() {
            $ = new GetBrokerEncryptionOption();
        }

        public Builder(GetBrokerEncryptionOption defaults) {
            $ = new GetBrokerEncryptionOption(Objects.requireNonNull(defaults));
        }

        public Builder kmsKeyId(String kmsKeyId) {
            $.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder useAwsOwnedKey(Boolean useAwsOwnedKey) {
            $.useAwsOwnedKey = useAwsOwnedKey;
            return this;
        }

        public GetBrokerEncryptionOption build() {
            $.kmsKeyId = Objects.requireNonNull($.kmsKeyId, "expected parameter 'kmsKeyId' to be non-null");
            $.useAwsOwnedKey = Objects.requireNonNull($.useAwsOwnedKey, "expected parameter 'useAwsOwnedKey' to be non-null");
            return $;
        }
    }

}
