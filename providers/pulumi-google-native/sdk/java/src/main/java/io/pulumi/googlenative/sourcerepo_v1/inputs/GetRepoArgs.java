// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sourcerepo_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRepoArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRepoArgs Empty = new GetRepoArgs();

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> project() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @Import(name="repoId", required=true)
      private final String repoId;

    public String repoId() {
        return this.repoId;
    }

    public GetRepoArgs(
        @Nullable String project,
        String repoId) {
        this.project = project;
        this.repoId = Objects.requireNonNull(repoId, "expected parameter 'repoId' to be non-null");
    }

    private GetRepoArgs() {
        this.project = null;
        this.repoId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRepoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String project;
        private String repoId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRepoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.project = defaults.project;
    	      this.repoId = defaults.repoId;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public Builder repoId(String repoId) {
            this.repoId = Objects.requireNonNull(repoId);
            return this;
        }        public GetRepoArgs build() {
            return new GetRepoArgs(project, repoId);
        }
    }
}
