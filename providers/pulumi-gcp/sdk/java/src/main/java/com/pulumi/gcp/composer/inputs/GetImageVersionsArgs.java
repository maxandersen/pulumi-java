// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.composer.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImageVersionsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetImageVersionsArgs Empty = new GetImageVersionsArgs();

    /**
     * The ID of the project to list versions in.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The location to list versions in.
     * If it is not provider, the provider region is used.
     * 
     */
    @Import(name="region")
    private @Nullable String region;

    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }

    private GetImageVersionsArgs() {}

    private GetImageVersionsArgs(GetImageVersionsArgs $) {
        this.project = $.project;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImageVersionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImageVersionsArgs $;

        public Builder() {
            $ = new GetImageVersionsArgs();
        }

        public Builder(GetImageVersionsArgs defaults) {
            $ = new GetImageVersionsArgs(Objects.requireNonNull(defaults));
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder region(@Nullable String region) {
            $.region = region;
            return this;
        }

        public GetImageVersionsArgs build() {
            return $;
        }
    }

}
