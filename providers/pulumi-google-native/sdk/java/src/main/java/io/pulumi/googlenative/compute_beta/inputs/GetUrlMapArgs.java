// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetUrlMapArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetUrlMapArgs Empty = new GetUrlMapArgs();

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> project() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @Import(name="urlMap", required=true)
      private final String urlMap;

    public String urlMap() {
        return this.urlMap;
    }

    public GetUrlMapArgs(
        @Nullable String project,
        String urlMap) {
        this.project = project;
        this.urlMap = Objects.requireNonNull(urlMap, "expected parameter 'urlMap' to be non-null");
    }

    private GetUrlMapArgs() {
        this.project = null;
        this.urlMap = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUrlMapArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String project;
        private String urlMap;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUrlMapArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.project = defaults.project;
    	      this.urlMap = defaults.urlMap;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public Builder urlMap(String urlMap) {
            this.urlMap = Objects.requireNonNull(urlMap);
            return this;
        }        public GetUrlMapArgs build() {
            return new GetUrlMapArgs(project, urlMap);
        }
    }
}
