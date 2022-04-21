// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


/**
 * KeyPolicy assigned to the storage account.
 * 
 */
public final class KeyPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final KeyPolicyArgs Empty = new KeyPolicyArgs();

    /**
     * The key expiration period in days.
     * 
     */
    @Import(name="keyExpirationPeriodInDays", required=true)
    private Output<Integer> keyExpirationPeriodInDays;

    public Output<Integer> keyExpirationPeriodInDays() {
        return this.keyExpirationPeriodInDays;
    }

    private KeyPolicyArgs() {}

    private KeyPolicyArgs(KeyPolicyArgs $) {
        this.keyExpirationPeriodInDays = $.keyExpirationPeriodInDays;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KeyPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KeyPolicyArgs $;

        public Builder() {
            $ = new KeyPolicyArgs();
        }

        public Builder(KeyPolicyArgs defaults) {
            $ = new KeyPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder keyExpirationPeriodInDays(Output<Integer> keyExpirationPeriodInDays) {
            $.keyExpirationPeriodInDays = keyExpirationPeriodInDays;
            return this;
        }

        public Builder keyExpirationPeriodInDays(Integer keyExpirationPeriodInDays) {
            return keyExpirationPeriodInDays(Output.of(keyExpirationPeriodInDays));
        }

        public KeyPolicyArgs build() {
            $.keyExpirationPeriodInDays = Objects.requireNonNull($.keyExpirationPeriodInDays, "expected parameter 'keyExpirationPeriodInDays' to be non-null");
            return $;
        }
    }

}
