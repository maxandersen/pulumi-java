// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Cosmos DB SQL storedProcedure resource object
 * 
 */
public final class SqlStoredProcedureResourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final SqlStoredProcedureResourceArgs Empty = new SqlStoredProcedureResourceArgs();

    /**
     * Body of the Stored Procedure
     * 
     */
    @Import(name="body")
    private @Nullable Output<String> body;

    public Optional<Output<String>> body() {
        return Optional.ofNullable(this.body);
    }

    /**
     * Name of the Cosmos DB SQL storedProcedure
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    public Output<String> id() {
        return this.id;
    }

    private SqlStoredProcedureResourceArgs() {}

    private SqlStoredProcedureResourceArgs(SqlStoredProcedureResourceArgs $) {
        this.body = $.body;
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SqlStoredProcedureResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlStoredProcedureResourceArgs $;

        public Builder() {
            $ = new SqlStoredProcedureResourceArgs();
        }

        public Builder(SqlStoredProcedureResourceArgs defaults) {
            $ = new SqlStoredProcedureResourceArgs(Objects.requireNonNull(defaults));
        }

        public Builder body(@Nullable Output<String> body) {
            $.body = body;
            return this;
        }

        public Builder body(String body) {
            return body(Output.of(body));
        }

        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        public SqlStoredProcedureResourceArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
