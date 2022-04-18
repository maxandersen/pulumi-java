// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.transcoder_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.transcoder_v1.outputs.JobConfigResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetJobTemplateResult {
    /**
     * The configuration for this template.
     * 
     */
    private final JobConfigResponse config;
    /**
     * The resource name of the job template. Format: `projects/{project_number}/locations/{location}/jobTemplates/{job_template}`
     * 
     */
    private final String name;

    @CustomType.Constructor
    private GetJobTemplateResult(
        @CustomType.Parameter("config") JobConfigResponse config,
        @CustomType.Parameter("name") String name) {
        this.config = config;
        this.name = name;
    }

    /**
     * The configuration for this template.
     * 
    */
    public JobConfigResponse config() {
        return this.config;
    }
    /**
     * The resource name of the job template. Format: `projects/{project_number}/locations/{location}/jobTemplates/{job_template}`
     * 
    */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobTemplateResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobConfigResponse config;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetJobTemplateResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.config = defaults.config;
    	      this.name = defaults.name;
        }

        public Builder config(JobConfigResponse config) {
            this.config = Objects.requireNonNull(config);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public GetJobTemplateResult build() {
            return new GetJobTemplateResult(config, name);
        }
    }
}
