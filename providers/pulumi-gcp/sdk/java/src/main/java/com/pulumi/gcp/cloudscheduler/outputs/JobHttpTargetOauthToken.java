// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudscheduler.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobHttpTargetOauthToken {
    /**
     * @return OAuth scope to be used for generating OAuth access token. If not specified,
     * &#34;https://www.googleapis.com/auth/cloud-platform&#34; will be used.
     * 
     */
    private final @Nullable String scope;
    /**
     * @return Service account email to be used for generating OAuth token.
     * The service account must be within the same project as the job.
     * 
     */
    private final String serviceAccountEmail;

    @CustomType.Constructor
    private JobHttpTargetOauthToken(
        @CustomType.Parameter("scope") @Nullable String scope,
        @CustomType.Parameter("serviceAccountEmail") String serviceAccountEmail) {
        this.scope = scope;
        this.serviceAccountEmail = serviceAccountEmail;
    }

    /**
     * @return OAuth scope to be used for generating OAuth access token. If not specified,
     * &#34;https://www.googleapis.com/auth/cloud-platform&#34; will be used.
     * 
     */
    public Optional<String> scope() {
        return Optional.ofNullable(this.scope);
    }
    /**
     * @return Service account email to be used for generating OAuth token.
     * The service account must be within the same project as the job.
     * 
     */
    public String serviceAccountEmail() {
        return this.serviceAccountEmail;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobHttpTargetOauthToken defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String scope;
        private String serviceAccountEmail;

        public Builder() {
    	      // Empty
        }

        public Builder(JobHttpTargetOauthToken defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scope = defaults.scope;
    	      this.serviceAccountEmail = defaults.serviceAccountEmail;
        }

        public Builder scope(@Nullable String scope) {
            this.scope = scope;
            return this;
        }
        public Builder serviceAccountEmail(String serviceAccountEmail) {
            this.serviceAccountEmail = Objects.requireNonNull(serviceAccountEmail);
            return this;
        }        public JobHttpTargetOauthToken build() {
            return new JobHttpTargetOauthToken(scope, serviceAccountEmail);
        }
    }
}
