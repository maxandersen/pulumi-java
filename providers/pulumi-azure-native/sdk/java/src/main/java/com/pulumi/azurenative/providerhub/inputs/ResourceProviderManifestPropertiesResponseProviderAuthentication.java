// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.providerhub.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ResourceProviderManifestPropertiesResponseProviderAuthentication extends com.pulumi.resources.InvokeArgs {

    public static final ResourceProviderManifestPropertiesResponseProviderAuthentication Empty = new ResourceProviderManifestPropertiesResponseProviderAuthentication();

    @Import(name="allowedAudiences", required=true)
    private List<String> allowedAudiences;

    public List<String> allowedAudiences() {
        return this.allowedAudiences;
    }

    private ResourceProviderManifestPropertiesResponseProviderAuthentication() {}

    private ResourceProviderManifestPropertiesResponseProviderAuthentication(ResourceProviderManifestPropertiesResponseProviderAuthentication $) {
        this.allowedAudiences = $.allowedAudiences;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceProviderManifestPropertiesResponseProviderAuthentication defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceProviderManifestPropertiesResponseProviderAuthentication $;

        public Builder() {
            $ = new ResourceProviderManifestPropertiesResponseProviderAuthentication();
        }

        public Builder(ResourceProviderManifestPropertiesResponseProviderAuthentication defaults) {
            $ = new ResourceProviderManifestPropertiesResponseProviderAuthentication(Objects.requireNonNull(defaults));
        }

        public Builder allowedAudiences(List<String> allowedAudiences) {
            $.allowedAudiences = allowedAudiences;
            return this;
        }

        public Builder allowedAudiences(String... allowedAudiences) {
            return allowedAudiences(List.of(allowedAudiences));
        }

        public ResourceProviderManifestPropertiesResponseProviderAuthentication build() {
            $.allowedAudiences = Objects.requireNonNull($.allowedAudiences, "expected parameter 'allowedAudiences' to be non-null");
            return $;
        }
    }

}
