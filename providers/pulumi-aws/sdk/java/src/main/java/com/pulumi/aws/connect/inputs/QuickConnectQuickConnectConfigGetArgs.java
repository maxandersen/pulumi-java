// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.connect.inputs;

import com.pulumi.aws.connect.inputs.QuickConnectQuickConnectConfigPhoneConfigGetArgs;
import com.pulumi.aws.connect.inputs.QuickConnectQuickConnectConfigQueueConfigGetArgs;
import com.pulumi.aws.connect.inputs.QuickConnectQuickConnectConfigUserConfigGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class QuickConnectQuickConnectConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final QuickConnectQuickConnectConfigGetArgs Empty = new QuickConnectQuickConnectConfigGetArgs();

    /**
     * Specifies the phone configuration of the Quick Connect. This is required only if `quick_connect_type` is `PHONE_NUMBER`. The `phone_config` block is documented below.
     * 
     */
    @Import(name="phoneConfigs")
    private @Nullable Output<List<QuickConnectQuickConnectConfigPhoneConfigGetArgs>> phoneConfigs;

    public Optional<Output<List<QuickConnectQuickConnectConfigPhoneConfigGetArgs>>> phoneConfigs() {
        return Optional.ofNullable(this.phoneConfigs);
    }

    /**
     * Specifies the queue configuration of the Quick Connect. This is required only if `quick_connect_type` is `QUEUE`. The `queue_config` block is documented below.
     * 
     */
    @Import(name="queueConfigs")
    private @Nullable Output<List<QuickConnectQuickConnectConfigQueueConfigGetArgs>> queueConfigs;

    public Optional<Output<List<QuickConnectQuickConnectConfigQueueConfigGetArgs>>> queueConfigs() {
        return Optional.ofNullable(this.queueConfigs);
    }

    /**
     * Specifies the configuration type of the quick connect. valid values are `PHONE_NUMBER`, `QUEUE`, `USER`.
     * 
     */
    @Import(name="quickConnectType", required=true)
    private Output<String> quickConnectType;

    public Output<String> quickConnectType() {
        return this.quickConnectType;
    }

    /**
     * Specifies the user configuration of the Quick Connect. This is required only if `quick_connect_type` is `USER`. The `user_config` block is documented below.
     * 
     */
    @Import(name="userConfigs")
    private @Nullable Output<List<QuickConnectQuickConnectConfigUserConfigGetArgs>> userConfigs;

    public Optional<Output<List<QuickConnectQuickConnectConfigUserConfigGetArgs>>> userConfigs() {
        return Optional.ofNullable(this.userConfigs);
    }

    private QuickConnectQuickConnectConfigGetArgs() {}

    private QuickConnectQuickConnectConfigGetArgs(QuickConnectQuickConnectConfigGetArgs $) {
        this.phoneConfigs = $.phoneConfigs;
        this.queueConfigs = $.queueConfigs;
        this.quickConnectType = $.quickConnectType;
        this.userConfigs = $.userConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(QuickConnectQuickConnectConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private QuickConnectQuickConnectConfigGetArgs $;

        public Builder() {
            $ = new QuickConnectQuickConnectConfigGetArgs();
        }

        public Builder(QuickConnectQuickConnectConfigGetArgs defaults) {
            $ = new QuickConnectQuickConnectConfigGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder phoneConfigs(@Nullable Output<List<QuickConnectQuickConnectConfigPhoneConfigGetArgs>> phoneConfigs) {
            $.phoneConfigs = phoneConfigs;
            return this;
        }

        public Builder phoneConfigs(List<QuickConnectQuickConnectConfigPhoneConfigGetArgs> phoneConfigs) {
            return phoneConfigs(Output.of(phoneConfigs));
        }

        public Builder phoneConfigs(QuickConnectQuickConnectConfigPhoneConfigGetArgs... phoneConfigs) {
            return phoneConfigs(List.of(phoneConfigs));
        }

        public Builder queueConfigs(@Nullable Output<List<QuickConnectQuickConnectConfigQueueConfigGetArgs>> queueConfigs) {
            $.queueConfigs = queueConfigs;
            return this;
        }

        public Builder queueConfigs(List<QuickConnectQuickConnectConfigQueueConfigGetArgs> queueConfigs) {
            return queueConfigs(Output.of(queueConfigs));
        }

        public Builder queueConfigs(QuickConnectQuickConnectConfigQueueConfigGetArgs... queueConfigs) {
            return queueConfigs(List.of(queueConfigs));
        }

        public Builder quickConnectType(Output<String> quickConnectType) {
            $.quickConnectType = quickConnectType;
            return this;
        }

        public Builder quickConnectType(String quickConnectType) {
            return quickConnectType(Output.of(quickConnectType));
        }

        public Builder userConfigs(@Nullable Output<List<QuickConnectQuickConnectConfigUserConfigGetArgs>> userConfigs) {
            $.userConfigs = userConfigs;
            return this;
        }

        public Builder userConfigs(List<QuickConnectQuickConnectConfigUserConfigGetArgs> userConfigs) {
            return userConfigs(Output.of(userConfigs));
        }

        public Builder userConfigs(QuickConnectQuickConnectConfigUserConfigGetArgs... userConfigs) {
            return userConfigs(List.of(userConfigs));
        }

        public QuickConnectQuickConnectConfigGetArgs build() {
            $.quickConnectType = Objects.requireNonNull($.quickConnectType, "expected parameter 'quickConnectType' to be non-null");
            return $;
        }
    }

}
