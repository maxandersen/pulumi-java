// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.inspectorv2.inputs;

import com.pulumi.awsnative.inspectorv2.inputs.FilterNumberFilter;
import com.pulumi.awsnative.inspectorv2.inputs.FilterStringFilter;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FilterPackageFilter extends com.pulumi.resources.InvokeArgs {

    public static final FilterPackageFilter Empty = new FilterPackageFilter();

    @Import(name="architecture")
    private @Nullable FilterStringFilter architecture;

    public Optional<FilterStringFilter> architecture() {
        return Optional.ofNullable(this.architecture);
    }

    @Import(name="epoch")
    private @Nullable FilterNumberFilter epoch;

    public Optional<FilterNumberFilter> epoch() {
        return Optional.ofNullable(this.epoch);
    }

    @Import(name="name")
    private @Nullable FilterStringFilter name;

    public Optional<FilterStringFilter> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="release")
    private @Nullable FilterStringFilter release;

    public Optional<FilterStringFilter> release() {
        return Optional.ofNullable(this.release);
    }

    @Import(name="sourceLayerHash")
    private @Nullable FilterStringFilter sourceLayerHash;

    public Optional<FilterStringFilter> sourceLayerHash() {
        return Optional.ofNullable(this.sourceLayerHash);
    }

    @Import(name="version")
    private @Nullable FilterStringFilter version;

    public Optional<FilterStringFilter> version() {
        return Optional.ofNullable(this.version);
    }

    private FilterPackageFilter() {}

    private FilterPackageFilter(FilterPackageFilter $) {
        this.architecture = $.architecture;
        this.epoch = $.epoch;
        this.name = $.name;
        this.release = $.release;
        this.sourceLayerHash = $.sourceLayerHash;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FilterPackageFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FilterPackageFilter $;

        public Builder() {
            $ = new FilterPackageFilter();
        }

        public Builder(FilterPackageFilter defaults) {
            $ = new FilterPackageFilter(Objects.requireNonNull(defaults));
        }

        public Builder architecture(@Nullable FilterStringFilter architecture) {
            $.architecture = architecture;
            return this;
        }

        public Builder epoch(@Nullable FilterNumberFilter epoch) {
            $.epoch = epoch;
            return this;
        }

        public Builder name(@Nullable FilterStringFilter name) {
            $.name = name;
            return this;
        }

        public Builder release(@Nullable FilterStringFilter release) {
            $.release = release;
            return this;
        }

        public Builder sourceLayerHash(@Nullable FilterStringFilter sourceLayerHash) {
            $.sourceLayerHash = sourceLayerHash;
            return this;
        }

        public Builder version(@Nullable FilterStringFilter version) {
            $.version = version;
            return this;
        }

        public FilterPackageFilter build() {
            return $;
        }
    }

}
