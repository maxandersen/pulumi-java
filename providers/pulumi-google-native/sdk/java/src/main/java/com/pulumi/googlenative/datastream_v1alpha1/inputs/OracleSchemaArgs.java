// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datastream_v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.datastream_v1alpha1.inputs.OracleTableArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Oracle schema.
 * 
 */
public final class OracleSchemaArgs extends com.pulumi.resources.ResourceArgs {

    public static final OracleSchemaArgs Empty = new OracleSchemaArgs();

    /**
     * Tables in the schema.
     * 
     */
    @Import(name="oracleTables")
      private final @Nullable Output<List<OracleTableArgs>> oracleTables;

    public Output<List<OracleTableArgs>> oracleTables() {
        return this.oracleTables == null ? Codegen.empty() : this.oracleTables;
    }

    /**
     * Schema name.
     * 
     */
    @Import(name="schemaName")
      private final @Nullable Output<String> schemaName;

    public Output<String> schemaName() {
        return this.schemaName == null ? Codegen.empty() : this.schemaName;
    }

    public OracleSchemaArgs(
        @Nullable Output<List<OracleTableArgs>> oracleTables,
        @Nullable Output<String> schemaName) {
        this.oracleTables = oracleTables;
        this.schemaName = schemaName;
    }

    private OracleSchemaArgs() {
        this.oracleTables = Codegen.empty();
        this.schemaName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OracleSchemaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<OracleTableArgs>> oracleTables;
        private @Nullable Output<String> schemaName;

        public Builder() {
    	      // Empty
        }

        public Builder(OracleSchemaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.oracleTables = defaults.oracleTables;
    	      this.schemaName = defaults.schemaName;
        }

        public Builder oracleTables(@Nullable Output<List<OracleTableArgs>> oracleTables) {
            this.oracleTables = oracleTables;
            return this;
        }
        public Builder oracleTables(@Nullable List<OracleTableArgs> oracleTables) {
            this.oracleTables = Codegen.ofNullable(oracleTables);
            return this;
        }
        public Builder oracleTables(OracleTableArgs... oracleTables) {
            return oracleTables(List.of(oracleTables));
        }
        public Builder schemaName(@Nullable Output<String> schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public Builder schemaName(@Nullable String schemaName) {
            this.schemaName = Codegen.ofNullable(schemaName);
            return this;
        }        public OracleSchemaArgs build() {
            return new OracleSchemaArgs(oracleTables, schemaName);
        }
    }
}
