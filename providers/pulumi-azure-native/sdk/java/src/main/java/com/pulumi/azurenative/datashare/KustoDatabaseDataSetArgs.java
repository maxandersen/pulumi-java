// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datashare;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KustoDatabaseDataSetArgs extends com.pulumi.resources.ResourceArgs {

    public static final KustoDatabaseDataSetArgs Empty = new KustoDatabaseDataSetArgs();

    /**
     * The name of the share account.
     * 
     */
    @Import(name="accountName", required=true)
    private Output<String> accountName;

    /**
     * @return The name of the share account.
     * 
     */
    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * The name of the dataSet.
     * 
     */
    @Import(name="dataSetName")
    private @Nullable Output<String> dataSetName;

    /**
     * @return The name of the dataSet.
     * 
     */
    public Optional<Output<String>> dataSetName() {
        return Optional.ofNullable(this.dataSetName);
    }

    /**
     * Kind of data set.
     * Expected value is &#39;KustoDatabase&#39;.
     * 
     */
    @Import(name="kind", required=true)
    private Output<String> kind;

    /**
     * @return Kind of data set.
     * Expected value is &#39;KustoDatabase&#39;.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }

    /**
     * Resource id of the kusto database.
     * 
     */
    @Import(name="kustoDatabaseResourceId", required=true)
    private Output<String> kustoDatabaseResourceId;

    /**
     * @return Resource id of the kusto database.
     * 
     */
    public Output<String> kustoDatabaseResourceId() {
        return this.kustoDatabaseResourceId;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The resource group name.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the share to add the data set to.
     * 
     */
    @Import(name="shareName", required=true)
    private Output<String> shareName;

    /**
     * @return The name of the share to add the data set to.
     * 
     */
    public Output<String> shareName() {
        return this.shareName;
    }

    private KustoDatabaseDataSetArgs() {}

    private KustoDatabaseDataSetArgs(KustoDatabaseDataSetArgs $) {
        this.accountName = $.accountName;
        this.dataSetName = $.dataSetName;
        this.kind = $.kind;
        this.kustoDatabaseResourceId = $.kustoDatabaseResourceId;
        this.resourceGroupName = $.resourceGroupName;
        this.shareName = $.shareName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KustoDatabaseDataSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KustoDatabaseDataSetArgs $;

        public Builder() {
            $ = new KustoDatabaseDataSetArgs();
        }

        public Builder(KustoDatabaseDataSetArgs defaults) {
            $ = new KustoDatabaseDataSetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName The name of the share account.
         * 
         * @return builder
         * 
         */
        public Builder accountName(Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param accountName The name of the share account.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        /**
         * @param dataSetName The name of the dataSet.
         * 
         * @return builder
         * 
         */
        public Builder dataSetName(@Nullable Output<String> dataSetName) {
            $.dataSetName = dataSetName;
            return this;
        }

        /**
         * @param dataSetName The name of the dataSet.
         * 
         * @return builder
         * 
         */
        public Builder dataSetName(String dataSetName) {
            return dataSetName(Output.of(dataSetName));
        }

        /**
         * @param kind Kind of data set.
         * Expected value is &#39;KustoDatabase&#39;.
         * 
         * @return builder
         * 
         */
        public Builder kind(Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind Kind of data set.
         * Expected value is &#39;KustoDatabase&#39;.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param kustoDatabaseResourceId Resource id of the kusto database.
         * 
         * @return builder
         * 
         */
        public Builder kustoDatabaseResourceId(Output<String> kustoDatabaseResourceId) {
            $.kustoDatabaseResourceId = kustoDatabaseResourceId;
            return this;
        }

        /**
         * @param kustoDatabaseResourceId Resource id of the kusto database.
         * 
         * @return builder
         * 
         */
        public Builder kustoDatabaseResourceId(String kustoDatabaseResourceId) {
            return kustoDatabaseResourceId(Output.of(kustoDatabaseResourceId));
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param shareName The name of the share to add the data set to.
         * 
         * @return builder
         * 
         */
        public Builder shareName(Output<String> shareName) {
            $.shareName = shareName;
            return this;
        }

        /**
         * @param shareName The name of the share to add the data set to.
         * 
         * @return builder
         * 
         */
        public Builder shareName(String shareName) {
            return shareName(Output.of(shareName));
        }

        public KustoDatabaseDataSetArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.kind = Codegen.stringProp("kind").output().arg($.kind).require();
            $.kustoDatabaseResourceId = Objects.requireNonNull($.kustoDatabaseResourceId, "expected parameter 'kustoDatabaseResourceId' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.shareName = Objects.requireNonNull($.shareName, "expected parameter 'shareName' to be non-null");
            return $;
        }
    }

}
