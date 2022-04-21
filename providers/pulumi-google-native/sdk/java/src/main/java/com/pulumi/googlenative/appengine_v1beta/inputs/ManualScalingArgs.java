// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine_v1beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A service with manual scaling runs continuously, allowing you to perform complex initialization and rely on the state of its memory over time.
 * 
 */
public final class ManualScalingArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManualScalingArgs Empty = new ManualScalingArgs();

    /**
     * Number of instances to assign to the service at the start. This number can later be altered by using the Modules API (https://cloud.google.com/appengine/docs/python/modules/functions) set_num_instances() function.
     * 
     */
    @Import(name="instances")
    private @Nullable Output<Integer> instances;

    public Optional<Output<Integer>> instances() {
        return Optional.ofNullable(this.instances);
    }

    private ManualScalingArgs() {}

    private ManualScalingArgs(ManualScalingArgs $) {
        this.instances = $.instances;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManualScalingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManualScalingArgs $;

        public Builder() {
            $ = new ManualScalingArgs();
        }

        public Builder(ManualScalingArgs defaults) {
            $ = new ManualScalingArgs(Objects.requireNonNull(defaults));
        }

        public Builder instances(@Nullable Output<Integer> instances) {
            $.instances = instances;
            return this;
        }

        public Builder instances(Integer instances) {
            return instances(Output.of(instances));
        }

        public ManualScalingArgs build() {
            return $;
        }
    }

}
