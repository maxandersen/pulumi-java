// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetInstanceTemplateServiceAccount {
    /**
     * The service account e-mail address. If not given, the
     * default Google Compute Engine service account is used.
     * 
     */
    private final String email;
    /**
     * A list of service scopes. Both OAuth2 URLs and gcloud
     * short names are supported. To allow full access to all Cloud APIs, use the
     * `cloud-platform` scope. See a complete list of scopes [here](https://cloud.google.com/sdk/gcloud/reference/alpha/compute/instances/set-scopes#--scopes).
     * 
     */
    private final List<String> scopes;

    @CustomType.Constructor
    private GetInstanceTemplateServiceAccount(
        @CustomType.Parameter("email") String email,
        @CustomType.Parameter("scopes") List<String> scopes) {
        this.email = email;
        this.scopes = scopes;
    }

    /**
     * The service account e-mail address. If not given, the
     * default Google Compute Engine service account is used.
     * 
    */
    public String email() {
        return this.email;
    }
    /**
     * A list of service scopes. Both OAuth2 URLs and gcloud
     * short names are supported. To allow full access to all Cloud APIs, use the
     * `cloud-platform` scope. See a complete list of scopes [here](https://cloud.google.com/sdk/gcloud/reference/alpha/compute/instances/set-scopes#--scopes).
     * 
    */
    public List<String> scopes() {
        return this.scopes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceTemplateServiceAccount defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String email;
        private List<String> scopes;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceTemplateServiceAccount defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.scopes = defaults.scopes;
        }

        public Builder email(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }
        public Builder scopes(List<String> scopes) {
            this.scopes = Objects.requireNonNull(scopes);
            return this;
        }
        public Builder scopes(String... scopes) {
            return scopes(List.of(scopes));
        }        public GetInstanceTemplateServiceAccount build() {
            return new GetInstanceTemplateServiceAccount(email, scopes);
        }
    }
}
