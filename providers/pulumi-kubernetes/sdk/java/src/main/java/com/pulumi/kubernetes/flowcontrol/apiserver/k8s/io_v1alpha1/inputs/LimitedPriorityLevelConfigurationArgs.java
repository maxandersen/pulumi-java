// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1alpha1.inputs.LimitResponseArgs;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * LimitedPriorityLevelConfiguration specifies how to handle requests that are subject to limits. It addresses two issues:
 *  * How are requests for this priority level limited?
 *  * What should be done with requests that exceed the limit?
 * 
 */
public final class LimitedPriorityLevelConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final LimitedPriorityLevelConfigurationArgs Empty = new LimitedPriorityLevelConfigurationArgs();

    /**
     * `assuredConcurrencyShares` (ACS) configures the execution limit, which is a limit on the number of requests of this priority level that may be exeucting at a given time.  ACS must be a positive number. The server's concurrency limit (SCL) is divided among the concurrency-controlled priority levels in proportion to their assured concurrency shares. This produces the assured concurrency value (ACV) --- the number of requests that may be executing at a time --- for each such priority level:
     * 
     *             ACV(l) = ceil( SCL * ACS(l) / ( sum[priority levels k] ACS(k) ) )
     * 
     * bigger numbers of ACS mean more reserved concurrent requests (at the expense of every other PL). This field has a default value of 30.
     * 
     */
    @Import(name="assuredConcurrencyShares")
      private final @Nullable Output<Integer> assuredConcurrencyShares;

    public Output<Integer> assuredConcurrencyShares() {
        return this.assuredConcurrencyShares == null ? Codegen.empty() : this.assuredConcurrencyShares;
    }

    /**
     * `limitResponse` indicates what to do with requests that can not be executed right now
     * 
     */
    @Import(name="limitResponse")
      private final @Nullable Output<LimitResponseArgs> limitResponse;

    public Output<LimitResponseArgs> limitResponse() {
        return this.limitResponse == null ? Codegen.empty() : this.limitResponse;
    }

    public LimitedPriorityLevelConfigurationArgs(
        @Nullable Output<Integer> assuredConcurrencyShares,
        @Nullable Output<LimitResponseArgs> limitResponse) {
        this.assuredConcurrencyShares = assuredConcurrencyShares;
        this.limitResponse = limitResponse;
    }

    private LimitedPriorityLevelConfigurationArgs() {
        this.assuredConcurrencyShares = Codegen.empty();
        this.limitResponse = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LimitedPriorityLevelConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> assuredConcurrencyShares;
        private @Nullable Output<LimitResponseArgs> limitResponse;

        public Builder() {
    	      // Empty
        }

        public Builder(LimitedPriorityLevelConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assuredConcurrencyShares = defaults.assuredConcurrencyShares;
    	      this.limitResponse = defaults.limitResponse;
        }

        public Builder assuredConcurrencyShares(@Nullable Output<Integer> assuredConcurrencyShares) {
            this.assuredConcurrencyShares = assuredConcurrencyShares;
            return this;
        }
        public Builder assuredConcurrencyShares(@Nullable Integer assuredConcurrencyShares) {
            this.assuredConcurrencyShares = Codegen.ofNullable(assuredConcurrencyShares);
            return this;
        }
        public Builder limitResponse(@Nullable Output<LimitResponseArgs> limitResponse) {
            this.limitResponse = limitResponse;
            return this;
        }
        public Builder limitResponse(@Nullable LimitResponseArgs limitResponse) {
            this.limitResponse = Codegen.ofNullable(limitResponse);
            return this;
        }        public LimitedPriorityLevelConfigurationArgs build() {
            return new LimitedPriorityLevelConfigurationArgs(assuredConcurrencyShares, limitResponse);
        }
    }
}
