// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.scheduler.inputs;

import com.pulumi.azurenative.scheduler.enums.JobCollectionState;
import com.pulumi.azurenative.scheduler.inputs.JobCollectionQuotaArgs;
import com.pulumi.azurenative.scheduler.inputs.SkuArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobCollectionPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobCollectionPropertiesArgs Empty = new JobCollectionPropertiesArgs();

    /**
     * Gets or sets the job collection quota.
     * 
     */
    @Import(name="quota")
    private @Nullable Output<JobCollectionQuotaArgs> quota;

    public Optional<Output<JobCollectionQuotaArgs>> quota() {
        return Optional.ofNullable(this.quota);
    }

    /**
     * Gets or sets the SKU.
     * 
     */
    @Import(name="sku")
    private @Nullable Output<SkuArgs> sku;

    public Optional<Output<SkuArgs>> sku() {
        return Optional.ofNullable(this.sku);
    }

    /**
     * Gets or sets the state.
     * 
     */
    @Import(name="state")
    private @Nullable Output<JobCollectionState> state;

    public Optional<Output<JobCollectionState>> state() {
        return Optional.ofNullable(this.state);
    }

    private JobCollectionPropertiesArgs() {}

    private JobCollectionPropertiesArgs(JobCollectionPropertiesArgs $) {
        this.quota = $.quota;
        this.sku = $.sku;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobCollectionPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobCollectionPropertiesArgs $;

        public Builder() {
            $ = new JobCollectionPropertiesArgs();
        }

        public Builder(JobCollectionPropertiesArgs defaults) {
            $ = new JobCollectionPropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder quota(@Nullable Output<JobCollectionQuotaArgs> quota) {
            $.quota = quota;
            return this;
        }

        public Builder quota(JobCollectionQuotaArgs quota) {
            return quota(Output.of(quota));
        }

        public Builder sku(@Nullable Output<SkuArgs> sku) {
            $.sku = sku;
            return this;
        }

        public Builder sku(SkuArgs sku) {
            return sku(Output.of(sku));
        }

        public Builder state(@Nullable Output<JobCollectionState> state) {
            $.state = state;
            return this;
        }

        public Builder state(JobCollectionState state) {
            return state(Output.of(state));
        }

        public JobCollectionPropertiesArgs build() {
            return $;
        }
    }

}
