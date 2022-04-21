// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegionInstanceGroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegionInstanceGroupArgs Empty = new GetRegionInstanceGroupArgs();

    /**
     * The name of the instance group.  One of `name` or `self_link` must be provided.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If `self_link` is provided, this value is ignored.  If neither `self_link`
     * nor `project` are provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The region in which the resource belongs.  If `self_link`
     * is provided, this value is ignored.  If neither `self_link` nor `region` are
     * provided, the provider region is used.
     * 
     */
    @Import(name="region")
    private @Nullable String region;

    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * The link to the instance group.  One of `name` or `self_link` must be provided.
     * 
     */
    @Import(name="selfLink")
    private @Nullable String selfLink;

    public Optional<String> selfLink() {
        return Optional.ofNullable(this.selfLink);
    }

    private GetRegionInstanceGroupArgs() {}

    private GetRegionInstanceGroupArgs(GetRegionInstanceGroupArgs $) {
        this.name = $.name;
        this.project = $.project;
        this.region = $.region;
        this.selfLink = $.selfLink;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegionInstanceGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegionInstanceGroupArgs $;

        public Builder() {
            $ = new GetRegionInstanceGroupArgs();
        }

        public Builder(GetRegionInstanceGroupArgs defaults) {
            $ = new GetRegionInstanceGroupArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder region(@Nullable String region) {
            $.region = region;
            return this;
        }

        public Builder selfLink(@Nullable String selfLink) {
            $.selfLink = selfLink;
            return this;
        }

        public GetRegionInstanceGroupArgs build() {
            return $;
        }
    }

}
