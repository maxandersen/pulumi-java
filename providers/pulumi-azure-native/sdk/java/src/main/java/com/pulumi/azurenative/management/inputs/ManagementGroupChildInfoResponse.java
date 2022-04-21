// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.management.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The child information of a management group.
 * 
 */
public final class ManagementGroupChildInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final ManagementGroupChildInfoResponse Empty = new ManagementGroupChildInfoResponse();

    /**
     * The list of children.
     * 
     */
    @Import(name="children")
    private @Nullable List<ManagementGroupChildInfoResponse> children;

    public Optional<List<ManagementGroupChildInfoResponse>> children() {
        return Optional.ofNullable(this.children);
    }

    /**
     * The friendly name of the child resource.
     * 
     */
    @Import(name="displayName")
    private @Nullable String displayName;

    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The fully qualified ID for the child resource (management group or subscription).  For example, /providers/Microsoft.Management/managementGroups/0000000-0000-0000-0000-000000000000
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The name of the child entity.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The fully qualified resource type which includes provider namespace (e.g. Microsoft.Management/managementGroups)
     * 
     */
    @Import(name="type")
    private @Nullable String type;

    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    private ManagementGroupChildInfoResponse() {}

    private ManagementGroupChildInfoResponse(ManagementGroupChildInfoResponse $) {
        this.children = $.children;
        this.displayName = $.displayName;
        this.id = $.id;
        this.name = $.name;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagementGroupChildInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagementGroupChildInfoResponse $;

        public Builder() {
            $ = new ManagementGroupChildInfoResponse();
        }

        public Builder(ManagementGroupChildInfoResponse defaults) {
            $ = new ManagementGroupChildInfoResponse(Objects.requireNonNull(defaults));
        }

        public Builder children(@Nullable List<ManagementGroupChildInfoResponse> children) {
            $.children = children;
            return this;
        }

        public Builder children(ManagementGroupChildInfoResponse... children) {
            return children(List.of(children));
        }

        public Builder displayName(@Nullable String displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public Builder type(@Nullable String type) {
            $.type = type;
            return this;
        }

        public ManagementGroupChildInfoResponse build() {
            return $;
        }
    }

}
