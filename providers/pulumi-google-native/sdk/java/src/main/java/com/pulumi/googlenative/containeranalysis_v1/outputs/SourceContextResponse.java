// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.containeranalysis_v1.outputs.CloudRepoSourceContextResponse;
import com.pulumi.googlenative.containeranalysis_v1.outputs.GerritSourceContextResponse;
import com.pulumi.googlenative.containeranalysis_v1.outputs.GitSourceContextResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class SourceContextResponse {
    /**
     * A SourceContext referring to a revision in a Google Cloud Source Repo.
     * 
     */
    private final CloudRepoSourceContextResponse cloudRepo;
    /**
     * A SourceContext referring to a Gerrit project.
     * 
     */
    private final GerritSourceContextResponse gerrit;
    /**
     * A SourceContext referring to any third party Git repo (e.g., GitHub).
     * 
     */
    private final GitSourceContextResponse git;
    /**
     * Labels with user defined metadata.
     * 
     */
    private final Map<String,String> labels;

    @CustomType.Constructor
    private SourceContextResponse(
        @CustomType.Parameter("cloudRepo") CloudRepoSourceContextResponse cloudRepo,
        @CustomType.Parameter("gerrit") GerritSourceContextResponse gerrit,
        @CustomType.Parameter("git") GitSourceContextResponse git,
        @CustomType.Parameter("labels") Map<String,String> labels) {
        this.cloudRepo = cloudRepo;
        this.gerrit = gerrit;
        this.git = git;
        this.labels = labels;
    }

    /**
     * A SourceContext referring to a revision in a Google Cloud Source Repo.
     * 
    */
    public CloudRepoSourceContextResponse cloudRepo() {
        return this.cloudRepo;
    }
    /**
     * A SourceContext referring to a Gerrit project.
     * 
    */
    public GerritSourceContextResponse gerrit() {
        return this.gerrit;
    }
    /**
     * A SourceContext referring to any third party Git repo (e.g., GitHub).
     * 
    */
    public GitSourceContextResponse git() {
        return this.git;
    }
    /**
     * Labels with user defined metadata.
     * 
    */
    public Map<String,String> labels() {
        return this.labels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceContextResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudRepoSourceContextResponse cloudRepo;
        private GerritSourceContextResponse gerrit;
        private GitSourceContextResponse git;
        private Map<String,String> labels;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceContextResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudRepo = defaults.cloudRepo;
    	      this.gerrit = defaults.gerrit;
    	      this.git = defaults.git;
    	      this.labels = defaults.labels;
        }

        public Builder cloudRepo(CloudRepoSourceContextResponse cloudRepo) {
            this.cloudRepo = Objects.requireNonNull(cloudRepo);
            return this;
        }
        public Builder gerrit(GerritSourceContextResponse gerrit) {
            this.gerrit = Objects.requireNonNull(gerrit);
            return this;
        }
        public Builder git(GitSourceContextResponse git) {
            this.git = Objects.requireNonNull(git);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }        public SourceContextResponse build() {
            return new SourceContextResponse(cloudRepo, gerrit, git, labels);
        }
    }
}
