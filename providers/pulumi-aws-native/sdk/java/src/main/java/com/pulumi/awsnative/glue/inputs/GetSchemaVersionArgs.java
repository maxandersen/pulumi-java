// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.glue.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSchemaVersionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSchemaVersionArgs Empty = new GetSchemaVersionArgs();

    /**
     * Represents the version ID associated with the schema version.
     * 
     */
    @Import(name="versionId", required=true)
    private String versionId;

    /**
     * @return Represents the version ID associated with the schema version.
     * 
     */
    public String versionId() {
        return this.versionId;
    }

    private GetSchemaVersionArgs() {}

    private GetSchemaVersionArgs(GetSchemaVersionArgs $) {
        this.versionId = $.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSchemaVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSchemaVersionArgs $;

        public Builder() {
            $ = new GetSchemaVersionArgs();
        }

        public Builder(GetSchemaVersionArgs defaults) {
            $ = new GetSchemaVersionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param versionId Represents the version ID associated with the schema version.
         * 
         * @return builder
         * 
         */
        public Builder versionId(String versionId) {
            $.versionId = versionId;
            return this;
        }

        public GetSchemaVersionArgs build() {
            $.versionId = Objects.requireNonNull($.versionId, "expected parameter 'versionId' to be non-null");
            return $;
        }
    }

}
