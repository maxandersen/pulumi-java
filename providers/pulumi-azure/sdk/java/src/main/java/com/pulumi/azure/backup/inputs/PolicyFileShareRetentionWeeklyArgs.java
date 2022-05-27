// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.backup.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class PolicyFileShareRetentionWeeklyArgs extends com.pulumi.resources.ResourceArgs {

    public static final PolicyFileShareRetentionWeeklyArgs Empty = new PolicyFileShareRetentionWeeklyArgs();

    /**
     * The number of yearly backups to keep. Must be between `1` and `10`
     * 
     */
    @Import(name="count", required=true)
    private Output<Integer> count;

    /**
     * @return The number of yearly backups to keep. Must be between `1` and `10`
     * 
     */
    public Output<Integer> count() {
        return this.count;
    }

    /**
     * The weekday backups to retain . Must be one of `Sunday`, `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday` or `Saturday`.
     * 
     */
    @Import(name="weekdays", required=true)
    private Output<List<String>> weekdays;

    /**
     * @return The weekday backups to retain . Must be one of `Sunday`, `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday` or `Saturday`.
     * 
     */
    public Output<List<String>> weekdays() {
        return this.weekdays;
    }

    private PolicyFileShareRetentionWeeklyArgs() {}

    private PolicyFileShareRetentionWeeklyArgs(PolicyFileShareRetentionWeeklyArgs $) {
        this.count = $.count;
        this.weekdays = $.weekdays;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyFileShareRetentionWeeklyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyFileShareRetentionWeeklyArgs $;

        public Builder() {
            $ = new PolicyFileShareRetentionWeeklyArgs();
        }

        public Builder(PolicyFileShareRetentionWeeklyArgs defaults) {
            $ = new PolicyFileShareRetentionWeeklyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param count The number of yearly backups to keep. Must be between `1` and `10`
         * 
         * @return builder
         * 
         */
        public Builder count(Output<Integer> count) {
            $.count = count;
            return this;
        }

        /**
         * @param count The number of yearly backups to keep. Must be between `1` and `10`
         * 
         * @return builder
         * 
         */
        public Builder count(Integer count) {
            return count(Output.of(count));
        }

        /**
         * @param weekdays The weekday backups to retain . Must be one of `Sunday`, `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday` or `Saturday`.
         * 
         * @return builder
         * 
         */
        public Builder weekdays(Output<List<String>> weekdays) {
            $.weekdays = weekdays;
            return this;
        }

        /**
         * @param weekdays The weekday backups to retain . Must be one of `Sunday`, `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday` or `Saturday`.
         * 
         * @return builder
         * 
         */
        public Builder weekdays(List<String> weekdays) {
            return weekdays(Output.of(weekdays));
        }

        /**
         * @param weekdays The weekday backups to retain . Must be one of `Sunday`, `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday` or `Saturday`.
         * 
         * @return builder
         * 
         */
        public Builder weekdays(String... weekdays) {
            return weekdays(List.of(weekdays));
        }

        public PolicyFileShareRetentionWeeklyArgs build() {
            $.count = Objects.requireNonNull($.count, "expected parameter 'count' to be non-null");
            $.weekdays = Objects.requireNonNull($.weekdays, "expected parameter 'weekdays' to be non-null");
            return $;
        }
    }

}
