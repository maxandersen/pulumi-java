// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigtableadmin_v2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTableArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTableArgs Empty = new GetTableArgs();

    @Import(name="instanceId", required=true)
    private String instanceId;

    public String instanceId() {
        return this.instanceId;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="tableId", required=true)
    private String tableId;

    public String tableId() {
        return this.tableId;
    }

    @Import(name="view")
    private @Nullable String view;

    public Optional<String> view() {
        return Optional.ofNullable(this.view);
    }

    private GetTableArgs() {}

    private GetTableArgs(GetTableArgs $) {
        this.instanceId = $.instanceId;
        this.project = $.project;
        this.tableId = $.tableId;
        this.view = $.view;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTableArgs $;

        public Builder() {
            $ = new GetTableArgs();
        }

        public Builder(GetTableArgs defaults) {
            $ = new GetTableArgs(Objects.requireNonNull(defaults));
        }

        public Builder instanceId(String instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder tableId(String tableId) {
            $.tableId = tableId;
            return this;
        }

        public Builder view(@Nullable String view) {
            $.view = view;
            return this;
        }

        public GetTableArgs build() {
            $.instanceId = Objects.requireNonNull($.instanceId, "expected parameter 'instanceId' to be non-null");
            $.tableId = Objects.requireNonNull($.tableId, "expected parameter 'tableId' to be non-null");
            return $;
        }
    }

}
