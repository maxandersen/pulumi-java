// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.elastic.inputs;

import com.pulumi.azurenative.elastic.inputs.FilteringTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Set of rules for sending logs for the Monitor resource.
 * 
 */
public final class LogRulesArgs extends com.pulumi.resources.ResourceArgs {

    public static final LogRulesArgs Empty = new LogRulesArgs();

    /**
     * List of filtering tags to be used for capturing logs. This only takes effect if SendActivityLogs flag is enabled. If empty, all resources will be captured. If only Exclude action is specified, the rules will apply to the list of all available resources. If Include actions are specified, the rules will only include resources with the associated tags.
     * 
     */
    @Import(name="filteringTags")
    private @Nullable Output<List<FilteringTagArgs>> filteringTags;

    public Optional<Output<List<FilteringTagArgs>>> filteringTags() {
        return Optional.ofNullable(this.filteringTags);
    }

    /**
     * Flag specifying if AAD logs should be sent for the Monitor resource.
     * 
     */
    @Import(name="sendAadLogs")
    private @Nullable Output<Boolean> sendAadLogs;

    public Optional<Output<Boolean>> sendAadLogs() {
        return Optional.ofNullable(this.sendAadLogs);
    }

    /**
     * Flag specifying if activity logs from Azure resources should be sent for the Monitor resource.
     * 
     */
    @Import(name="sendActivityLogs")
    private @Nullable Output<Boolean> sendActivityLogs;

    public Optional<Output<Boolean>> sendActivityLogs() {
        return Optional.ofNullable(this.sendActivityLogs);
    }

    /**
     * Flag specifying if subscription logs should be sent for the Monitor resource.
     * 
     */
    @Import(name="sendSubscriptionLogs")
    private @Nullable Output<Boolean> sendSubscriptionLogs;

    public Optional<Output<Boolean>> sendSubscriptionLogs() {
        return Optional.ofNullable(this.sendSubscriptionLogs);
    }

    private LogRulesArgs() {}

    private LogRulesArgs(LogRulesArgs $) {
        this.filteringTags = $.filteringTags;
        this.sendAadLogs = $.sendAadLogs;
        this.sendActivityLogs = $.sendActivityLogs;
        this.sendSubscriptionLogs = $.sendSubscriptionLogs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogRulesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogRulesArgs $;

        public Builder() {
            $ = new LogRulesArgs();
        }

        public Builder(LogRulesArgs defaults) {
            $ = new LogRulesArgs(Objects.requireNonNull(defaults));
        }

        public Builder filteringTags(@Nullable Output<List<FilteringTagArgs>> filteringTags) {
            $.filteringTags = filteringTags;
            return this;
        }

        public Builder filteringTags(List<FilteringTagArgs> filteringTags) {
            return filteringTags(Output.of(filteringTags));
        }

        public Builder filteringTags(FilteringTagArgs... filteringTags) {
            return filteringTags(List.of(filteringTags));
        }

        public Builder sendAadLogs(@Nullable Output<Boolean> sendAadLogs) {
            $.sendAadLogs = sendAadLogs;
            return this;
        }

        public Builder sendAadLogs(Boolean sendAadLogs) {
            return sendAadLogs(Output.of(sendAadLogs));
        }

        public Builder sendActivityLogs(@Nullable Output<Boolean> sendActivityLogs) {
            $.sendActivityLogs = sendActivityLogs;
            return this;
        }

        public Builder sendActivityLogs(Boolean sendActivityLogs) {
            return sendActivityLogs(Output.of(sendActivityLogs));
        }

        public Builder sendSubscriptionLogs(@Nullable Output<Boolean> sendSubscriptionLogs) {
            $.sendSubscriptionLogs = sendSubscriptionLogs;
            return this;
        }

        public Builder sendSubscriptionLogs(Boolean sendSubscriptionLogs) {
            return sendSubscriptionLogs(Output.of(sendSubscriptionLogs));
        }

        public LogRulesArgs build() {
            return $;
        }
    }

}
