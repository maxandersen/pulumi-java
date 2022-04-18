// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPublicAdvertisedPrefixArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPublicAdvertisedPrefixArgs Empty = new GetPublicAdvertisedPrefixArgs();

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> project() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @Import(name="publicAdvertisedPrefix", required=true)
      private final String publicAdvertisedPrefix;

    public String publicAdvertisedPrefix() {
        return this.publicAdvertisedPrefix;
    }

    public GetPublicAdvertisedPrefixArgs(
        @Nullable String project,
        String publicAdvertisedPrefix) {
        this.project = project;
        this.publicAdvertisedPrefix = Objects.requireNonNull(publicAdvertisedPrefix, "expected parameter 'publicAdvertisedPrefix' to be non-null");
    }

    private GetPublicAdvertisedPrefixArgs() {
        this.project = null;
        this.publicAdvertisedPrefix = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPublicAdvertisedPrefixArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String project;
        private String publicAdvertisedPrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPublicAdvertisedPrefixArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.project = defaults.project;
    	      this.publicAdvertisedPrefix = defaults.publicAdvertisedPrefix;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public Builder publicAdvertisedPrefix(String publicAdvertisedPrefix) {
            this.publicAdvertisedPrefix = Objects.requireNonNull(publicAdvertisedPrefix);
            return this;
        }        public GetPublicAdvertisedPrefixArgs build() {
            return new GetPublicAdvertisedPrefixArgs(project, publicAdvertisedPrefix);
        }
    }
}
