// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iam.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRoleArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRoleArgs Empty = new GetRoleArgs();

    /**
     * The friendly IAM role name to match.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * The tags attached to the role.
     * 
     */
    @Import(name="tags")
      private final @Nullable Map<String,String> tags;

    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public GetRoleArgs(
        String name,
        @Nullable Map<String,String> tags) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.tags = tags;
    }

    private GetRoleArgs() {
        this.name = null;
        this.tags = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRoleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRoleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }        public GetRoleArgs build() {
            return new GetRoleArgs(name, tags);
        }
    }
}
