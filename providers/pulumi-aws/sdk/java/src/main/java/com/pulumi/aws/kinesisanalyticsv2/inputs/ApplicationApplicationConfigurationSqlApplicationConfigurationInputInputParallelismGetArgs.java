// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesisanalyticsv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelismGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelismGetArgs Empty = new ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelismGetArgs();

    /**
     * The number of in-application streams to create.
     * 
     */
    @Import(name="count")
    private @Nullable Output<Integer> count;

    public Optional<Output<Integer>> count() {
        return Optional.ofNullable(this.count);
    }

    private ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelismGetArgs() {}

    private ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelismGetArgs(ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelismGetArgs $) {
        this.count = $.count;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelismGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelismGetArgs $;

        public Builder() {
            $ = new ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelismGetArgs();
        }

        public Builder(ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelismGetArgs defaults) {
            $ = new ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelismGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder count(@Nullable Output<Integer> count) {
            $.count = count;
            return this;
        }

        public Builder count(Integer count) {
            return count(Output.of(count));
        }

        public ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelismGetArgs build() {
            return $;
        }
    }

}
