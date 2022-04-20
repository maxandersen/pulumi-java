// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.autoscaling_v2beta2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.autoscaling_v2beta2.inputs.MetricTargetArgs;
import java.lang.String;
import java.util.Objects;


/**
 * ResourceMetricSource indicates how to scale on a resource metric known to Kubernetes, as specified in requests and limits, describing each pod in the current scale target (e.g. CPU or memory).  The values will be averaged together before being compared to the target.  Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the &#34;pods&#34; source.  Only one &#34;target&#34; type should be set.
 * 
 */
public final class ResourceMetricSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceMetricSourceArgs Empty = new ResourceMetricSourceArgs();

    /**
     * name is the name of the resource in question.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * target specifies the target value for the given metric
     * 
     */
    @Import(name="target", required=true)
      private final Output<MetricTargetArgs> target;

    public Output<MetricTargetArgs> target() {
        return this.target;
    }

    public ResourceMetricSourceArgs(
        Output<String> name,
        Output<MetricTargetArgs> target) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.target = Objects.requireNonNull(target, "expected parameter 'target' to be non-null");
    }

    private ResourceMetricSourceArgs() {
        this.name = Codegen.empty();
        this.target = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceMetricSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> name;
        private Output<MetricTargetArgs> target;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceMetricSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.target = defaults.target;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder target(Output<MetricTargetArgs> target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }
        public Builder target(MetricTargetArgs target) {
            this.target = Output.of(Objects.requireNonNull(target));
            return this;
        }        public ResourceMetricSourceArgs build() {
            return new ResourceMetricSourceArgs(name, target);
        }
    }
}
