// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrun.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceTemplateSpecContainerResourcesGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceTemplateSpecContainerResourcesGetArgs Empty = new ServiceTemplateSpecContainerResourcesGetArgs();

    /**
     * Limits describes the maximum amount of compute resources allowed.
     * The values of the map is string form of the &#39;quantity&#39; k8s type:
     * https://github.com/kubernetes/kubernetes/blob/master/staging/src/k8s.io/apimachinery/pkg/api/resource/quantity.go
     * 
     */
    @Import(name="limits")
    private @Nullable Output<Map<String,String>> limits;

    public Optional<Output<Map<String,String>>> limits() {
        return Optional.ofNullable(this.limits);
    }

    /**
     * Requests describes the minimum amount of compute resources required.
     * If Requests is omitted for a container, it defaults to Limits if that is
     * explicitly specified, otherwise to an implementation-defined value.
     * The values of the map is string form of the &#39;quantity&#39; k8s type:
     * https://github.com/kubernetes/kubernetes/blob/master/staging/src/k8s.io/apimachinery/pkg/api/resource/quantity.go
     * 
     */
    @Import(name="requests")
    private @Nullable Output<Map<String,String>> requests;

    public Optional<Output<Map<String,String>>> requests() {
        return Optional.ofNullable(this.requests);
    }

    private ServiceTemplateSpecContainerResourcesGetArgs() {}

    private ServiceTemplateSpecContainerResourcesGetArgs(ServiceTemplateSpecContainerResourcesGetArgs $) {
        this.limits = $.limits;
        this.requests = $.requests;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceTemplateSpecContainerResourcesGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceTemplateSpecContainerResourcesGetArgs $;

        public Builder() {
            $ = new ServiceTemplateSpecContainerResourcesGetArgs();
        }

        public Builder(ServiceTemplateSpecContainerResourcesGetArgs defaults) {
            $ = new ServiceTemplateSpecContainerResourcesGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder limits(@Nullable Output<Map<String,String>> limits) {
            $.limits = limits;
            return this;
        }

        public Builder limits(Map<String,String> limits) {
            return limits(Output.of(limits));
        }

        public Builder requests(@Nullable Output<Map<String,String>> requests) {
            $.requests = requests;
            return this;
        }

        public Builder requests(Map<String,String> requests) {
            return requests(Output.of(requests));
        }

        public ServiceTemplateSpecContainerResourcesGetArgs build() {
            return $;
        }
    }

}
