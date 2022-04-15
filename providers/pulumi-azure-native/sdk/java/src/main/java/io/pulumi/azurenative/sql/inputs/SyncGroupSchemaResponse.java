// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.inputs;

import io.pulumi.azurenative.sql.inputs.SyncGroupSchemaTableResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of sync group schema.
 * 
 */
public final class SyncGroupSchemaResponse extends io.pulumi.resources.InvokeArgs {

    public static final SyncGroupSchemaResponse Empty = new SyncGroupSchemaResponse();

    /**
     * Name of master sync member where the schema is from.
     * 
     */
    @Import(name="masterSyncMemberName")
      private final @Nullable String masterSyncMemberName;

    public Optional<String> masterSyncMemberName() {
        return this.masterSyncMemberName == null ? Optional.empty() : Optional.ofNullable(this.masterSyncMemberName);
    }

    /**
     * List of tables in sync group schema.
     * 
     */
    @Import(name="tables")
      private final @Nullable List<SyncGroupSchemaTableResponse> tables;

    public List<SyncGroupSchemaTableResponse> tables() {
        return this.tables == null ? List.of() : this.tables;
    }

    public SyncGroupSchemaResponse(
        @Nullable String masterSyncMemberName,
        @Nullable List<SyncGroupSchemaTableResponse> tables) {
        this.masterSyncMemberName = masterSyncMemberName;
        this.tables = tables;
    }

    private SyncGroupSchemaResponse() {
        this.masterSyncMemberName = null;
        this.tables = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SyncGroupSchemaResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String masterSyncMemberName;
        private @Nullable List<SyncGroupSchemaTableResponse> tables;

        public Builder() {
    	      // Empty
        }

        public Builder(SyncGroupSchemaResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.masterSyncMemberName = defaults.masterSyncMemberName;
    	      this.tables = defaults.tables;
        }

        public Builder masterSyncMemberName(@Nullable String masterSyncMemberName) {
            this.masterSyncMemberName = masterSyncMemberName;
            return this;
        }
        public Builder tables(@Nullable List<SyncGroupSchemaTableResponse> tables) {
            this.tables = tables;
            return this;
        }
        public Builder tables(SyncGroupSchemaTableResponse... tables) {
            return tables(List.of(tables));
        }        public SyncGroupSchemaResponse build() {
            return new SyncGroupSchemaResponse(masterSyncMemberName, tables);
        }
    }
}
