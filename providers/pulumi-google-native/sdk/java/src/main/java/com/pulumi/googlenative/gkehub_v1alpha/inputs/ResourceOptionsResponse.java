// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkehub_v1alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * ResourceOptions represent options for Kubernetes resource generation.
 * 
 */
public final class ResourceOptionsResponse extends com.pulumi.resources.InvokeArgs {

    public static final ResourceOptionsResponse Empty = new ResourceOptionsResponse();

    /**
     * Optional. The Connect agent version to use for connect_resources. Defaults to the latest GKE Connect version. The version must be a currently supported version, obsolete versions will be rejected.
     * 
     */
    @Import(name="connectVersion", required=true)
    private String connectVersion;

    public String connectVersion() {
        return this.connectVersion;
    }

    /**
     * Optional. Major version of the Kubernetes cluster. This is only used to determine which version to use for the CustomResourceDefinition resources, `apiextensions/v1beta1` or`apiextensions/v1`.
     * 
     */
    @Import(name="k8sVersion", required=true)
    private String k8sVersion;

    public String k8sVersion() {
        return this.k8sVersion;
    }

    /**
     * Optional. Use `apiextensions/v1beta1` instead of `apiextensions/v1` for CustomResourceDefinition resources. This option should be set for clusters with Kubernetes apiserver versions &lt;1.16.
     * 
     */
    @Import(name="v1beta1Crd", required=true)
    private Boolean v1beta1Crd;

    public Boolean v1beta1Crd() {
        return this.v1beta1Crd;
    }

    private ResourceOptionsResponse() {}

    private ResourceOptionsResponse(ResourceOptionsResponse $) {
        this.connectVersion = $.connectVersion;
        this.k8sVersion = $.k8sVersion;
        this.v1beta1Crd = $.v1beta1Crd;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceOptionsResponse $;

        public Builder() {
            $ = new ResourceOptionsResponse();
        }

        public Builder(ResourceOptionsResponse defaults) {
            $ = new ResourceOptionsResponse(Objects.requireNonNull(defaults));
        }

        public Builder connectVersion(String connectVersion) {
            $.connectVersion = connectVersion;
            return this;
        }

        public Builder k8sVersion(String k8sVersion) {
            $.k8sVersion = k8sVersion;
            return this;
        }

        public Builder v1beta1Crd(Boolean v1beta1Crd) {
            $.v1beta1Crd = v1beta1Crd;
            return this;
        }

        public ResourceOptionsResponse build() {
            $.connectVersion = Objects.requireNonNull($.connectVersion, "expected parameter 'connectVersion' to be non-null");
            $.k8sVersion = Objects.requireNonNull($.k8sVersion, "expected parameter 'k8sVersion' to be non-null");
            $.v1beta1Crd = Objects.requireNonNull($.v1beta1Crd, "expected parameter 'v1beta1Crd' to be non-null");
            return $;
        }
    }

}
