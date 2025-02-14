// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery_v2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTableArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTableArgs Empty = new GetTableArgs();

    @Import(name="datasetId", required=true)
    private String datasetId;

    public String datasetId() {
        return this.datasetId;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="selectedFields")
    private @Nullable String selectedFields;

    public Optional<String> selectedFields() {
        return Optional.ofNullable(this.selectedFields);
    }

    @Import(name="tableId", required=true)
    private String tableId;

    public String tableId() {
        return this.tableId;
    }

    private GetTableArgs() {}

    private GetTableArgs(GetTableArgs $) {
        this.datasetId = $.datasetId;
        this.project = $.project;
        this.selectedFields = $.selectedFields;
        this.tableId = $.tableId;
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

        public Builder datasetId(String datasetId) {
            $.datasetId = datasetId;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder selectedFields(@Nullable String selectedFields) {
            $.selectedFields = selectedFields;
            return this;
        }

        public Builder tableId(String tableId) {
            $.tableId = tableId;
            return this;
        }

        public GetTableArgs build() {
            $.datasetId = Objects.requireNonNull($.datasetId, "expected parameter 'datasetId' to be non-null");
            $.tableId = Objects.requireNonNull($.tableId, "expected parameter 'tableId' to be non-null");
            return $;
        }
    }

}
