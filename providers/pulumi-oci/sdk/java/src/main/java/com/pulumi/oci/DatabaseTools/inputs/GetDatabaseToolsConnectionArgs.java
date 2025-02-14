// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DatabaseTools.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDatabaseToolsConnectionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDatabaseToolsConnectionArgs Empty = new GetDatabaseToolsConnectionArgs();

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a DatabaseToolsConnection.
     * 
     */
    @Import(name="databaseToolsConnectionId", required=true)
    private String databaseToolsConnectionId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a DatabaseToolsConnection.
     * 
     */
    public String databaseToolsConnectionId() {
        return this.databaseToolsConnectionId;
    }

    private GetDatabaseToolsConnectionArgs() {}

    private GetDatabaseToolsConnectionArgs(GetDatabaseToolsConnectionArgs $) {
        this.databaseToolsConnectionId = $.databaseToolsConnectionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDatabaseToolsConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDatabaseToolsConnectionArgs $;

        public Builder() {
            $ = new GetDatabaseToolsConnectionArgs();
        }

        public Builder(GetDatabaseToolsConnectionArgs defaults) {
            $ = new GetDatabaseToolsConnectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param databaseToolsConnectionId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a DatabaseToolsConnection.
         * 
         * @return builder
         * 
         */
        public Builder databaseToolsConnectionId(String databaseToolsConnectionId) {
            $.databaseToolsConnectionId = databaseToolsConnectionId;
            return this;
        }

        public GetDatabaseToolsConnectionArgs build() {
            $.databaseToolsConnectionId = Objects.requireNonNull($.databaseToolsConnectionId, "expected parameter 'databaseToolsConnectionId' to be non-null");
            return $;
        }
    }

}
