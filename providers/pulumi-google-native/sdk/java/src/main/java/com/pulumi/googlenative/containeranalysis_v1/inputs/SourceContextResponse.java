// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis_v1.inputs.CloudRepoSourceContextResponse;
import com.pulumi.googlenative.containeranalysis_v1.inputs.GerritSourceContextResponse;
import com.pulumi.googlenative.containeranalysis_v1.inputs.GitSourceContextResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * A SourceContext is a reference to a tree of files. A SourceContext together with a path point to a unique revision of a single file or directory.
 * 
 */
public final class SourceContextResponse extends com.pulumi.resources.InvokeArgs {

    public static final SourceContextResponse Empty = new SourceContextResponse();

    /**
     * A SourceContext referring to a revision in a Google Cloud Source Repo.
     * 
     */
    @Import(name="cloudRepo", required=true)
      private final CloudRepoSourceContextResponse cloudRepo;

    public CloudRepoSourceContextResponse cloudRepo() {
        return this.cloudRepo;
    }

    /**
     * A SourceContext referring to a Gerrit project.
     * 
     */
    @Import(name="gerrit", required=true)
      private final GerritSourceContextResponse gerrit;

    public GerritSourceContextResponse gerrit() {
        return this.gerrit;
    }

    /**
     * A SourceContext referring to any third party Git repo (e.g., GitHub).
     * 
     */
    @Import(name="git", required=true)
      private final GitSourceContextResponse git;

    public GitSourceContextResponse git() {
        return this.git;
    }

    /**
     * Labels with user defined metadata.
     * 
     */
    @Import(name="labels", required=true)
      private final Map<String,String> labels;

    public Map<String,String> labels() {
        return this.labels;
    }

    public SourceContextResponse(
        CloudRepoSourceContextResponse cloudRepo,
        GerritSourceContextResponse gerrit,
        GitSourceContextResponse git,
        Map<String,String> labels) {
        this.cloudRepo = Objects.requireNonNull(cloudRepo, "expected parameter 'cloudRepo' to be non-null");
        this.gerrit = Objects.requireNonNull(gerrit, "expected parameter 'gerrit' to be non-null");
        this.git = Objects.requireNonNull(git, "expected parameter 'git' to be non-null");
        this.labels = Objects.requireNonNull(labels, "expected parameter 'labels' to be non-null");
    }

    private SourceContextResponse() {
        this.cloudRepo = null;
        this.gerrit = null;
        this.git = null;
        this.labels = Map.of();
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
