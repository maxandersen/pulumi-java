// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccountBlobPropertiesContainerDeleteRetentionPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccountBlobPropertiesContainerDeleteRetentionPolicyArgs Empty = new AccountBlobPropertiesContainerDeleteRetentionPolicyArgs();

    /**
     * Specifies the number of days that the container should be retained, between `1` and `365` days. Defaults to `7`.
     * 
     */
    @Import(name="days")
    private @Nullable Output<Integer> days;

    /**
     * @return Specifies the number of days that the container should be retained, between `1` and `365` days. Defaults to `7`.
     * 
     */
    public Optional<Output<Integer>> days() {
        return Optional.ofNullable(this.days);
    }

    private AccountBlobPropertiesContainerDeleteRetentionPolicyArgs() {}

    private AccountBlobPropertiesContainerDeleteRetentionPolicyArgs(AccountBlobPropertiesContainerDeleteRetentionPolicyArgs $) {
        this.days = $.days;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccountBlobPropertiesContainerDeleteRetentionPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccountBlobPropertiesContainerDeleteRetentionPolicyArgs $;

        public Builder() {
            $ = new AccountBlobPropertiesContainerDeleteRetentionPolicyArgs();
        }

        public Builder(AccountBlobPropertiesContainerDeleteRetentionPolicyArgs defaults) {
            $ = new AccountBlobPropertiesContainerDeleteRetentionPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param days Specifies the number of days that the container should be retained, between `1` and `365` days. Defaults to `7`.
         * 
         * @return builder
         * 
         */
        public Builder days(@Nullable Output<Integer> days) {
            $.days = days;
            return this;
        }

        /**
         * @param days Specifies the number of days that the container should be retained, between `1` and `365` days. Defaults to `7`.
         * 
         * @return builder
         * 
         */
        public Builder days(Integer days) {
            return days(Output.of(days));
        }

        public AccountBlobPropertiesContainerDeleteRetentionPolicyArgs build() {
            return $;
        }
    }

}
