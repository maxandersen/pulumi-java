// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleDevtoolsContaineranalysisV1alpha1ProjectRepoIdResponse {
    /**
     * The ID of the project.
     * 
     */
    private final String project;
    /**
     * The name of the repo. Leave empty for the default repo.
     * 
     */
    private final String repoName;

    @CustomType.Constructor
    private GoogleDevtoolsContaineranalysisV1alpha1ProjectRepoIdResponse(
        @CustomType.Parameter("project") String project,
        @CustomType.Parameter("repoName") String repoName) {
        this.project = project;
        this.repoName = repoName;
    }

    /**
     * The ID of the project.
     * 
    */
    public String project() {
        return this.project;
    }
    /**
     * The name of the repo. Leave empty for the default repo.
     * 
    */
    public String repoName() {
        return this.repoName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleDevtoolsContaineranalysisV1alpha1ProjectRepoIdResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String project;
        private String repoName;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleDevtoolsContaineranalysisV1alpha1ProjectRepoIdResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.project = defaults.project;
    	      this.repoName = defaults.repoName;
        }

        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        public Builder repoName(String repoName) {
            this.repoName = Objects.requireNonNull(repoName);
            return this;
        }        public GoogleDevtoolsContaineranalysisV1alpha1ProjectRepoIdResponse build() {
            return new GoogleDevtoolsContaineranalysisV1alpha1ProjectRepoIdResponse(project, repoName);
        }
    }
}
