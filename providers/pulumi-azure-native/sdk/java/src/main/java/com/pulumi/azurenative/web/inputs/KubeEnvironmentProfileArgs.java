// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specification for a Kubernetes Environment to use for this resource.
 * 
 */
public final class KubeEnvironmentProfileArgs extends ResourceArgs {

    public static final KubeEnvironmentProfileArgs Empty = new KubeEnvironmentProfileArgs();

    /**
     * Resource ID of the Kubernetes Environment.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Resource ID of the Kubernetes Environment.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    private KubeEnvironmentProfileArgs() {}

    private KubeEnvironmentProfileArgs(KubeEnvironmentProfileArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KubeEnvironmentProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KubeEnvironmentProfileArgs $;

        public Builder() {
            $ = new KubeEnvironmentProfileArgs();
        }

        public Builder(KubeEnvironmentProfileArgs defaults) {
            $ = new KubeEnvironmentProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id Resource ID of the Kubernetes Environment.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Resource ID of the Kubernetes Environment.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public KubeEnvironmentProfileArgs build() {
            return $;
        }
    }

}
