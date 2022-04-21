// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.organizations.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetProjectArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProjectArgs Empty = new GetProjectArgs();

    /**
     * The project ID. If it is not provided, the provider project is used.
     * 
     */
    @Import(name="projectId")
    private @Nullable String projectId;

    public Optional<String> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    private GetProjectArgs() {}

    private GetProjectArgs(GetProjectArgs $) {
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProjectArgs $;

        public Builder() {
            $ = new GetProjectArgs();
        }

        public Builder(GetProjectArgs defaults) {
            $ = new GetProjectArgs(Objects.requireNonNull(defaults));
        }

        public Builder projectId(@Nullable String projectId) {
            $.projectId = projectId;
            return this;
        }

        public GetProjectArgs build() {
            return $;
        }
    }

}
