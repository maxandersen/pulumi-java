// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Object;
import java.util.Objects;


/**
 * Azure ML WebService Input/Output file
 * 
 */
public final class AzureMLWebServiceFileArgs extends ResourceArgs {

    public static final AzureMLWebServiceFileArgs Empty = new AzureMLWebServiceFileArgs();

    /**
     * The relative file path, including container name, in the Azure Blob Storage specified by the LinkedService. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="filePath", required=true)
    private Output<Object> filePath;

    /**
     * @return The relative file path, including container name, in the Azure Blob Storage specified by the LinkedService. Type: string (or Expression with resultType string).
     * 
     */
    public Output<Object> filePath() {
        return this.filePath;
    }

    /**
     * Reference to an Azure Storage LinkedService, where Azure ML WebService Input/Output file located.
     * 
     */
    @Import(name="linkedServiceName", required=true)
    private Output<LinkedServiceReferenceArgs> linkedServiceName;

    /**
     * @return Reference to an Azure Storage LinkedService, where Azure ML WebService Input/Output file located.
     * 
     */
    public Output<LinkedServiceReferenceArgs> linkedServiceName() {
        return this.linkedServiceName;
    }

    private AzureMLWebServiceFileArgs() {}

    private AzureMLWebServiceFileArgs(AzureMLWebServiceFileArgs $) {
        this.filePath = $.filePath;
        this.linkedServiceName = $.linkedServiceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureMLWebServiceFileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureMLWebServiceFileArgs $;

        public Builder() {
            $ = new AzureMLWebServiceFileArgs();
        }

        public Builder(AzureMLWebServiceFileArgs defaults) {
            $ = new AzureMLWebServiceFileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filePath The relative file path, including container name, in the Azure Blob Storage specified by the LinkedService. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder filePath(Output<Object> filePath) {
            $.filePath = filePath;
            return this;
        }

        /**
         * @param filePath The relative file path, including container name, in the Azure Blob Storage specified by the LinkedService. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder filePath(Object filePath) {
            return filePath(Output.of(filePath));
        }

        /**
         * @param linkedServiceName Reference to an Azure Storage LinkedService, where Azure ML WebService Input/Output file located.
         * 
         * @return builder
         * 
         */
        public Builder linkedServiceName(Output<LinkedServiceReferenceArgs> linkedServiceName) {
            $.linkedServiceName = linkedServiceName;
            return this;
        }

        /**
         * @param linkedServiceName Reference to an Azure Storage LinkedService, where Azure ML WebService Input/Output file located.
         * 
         * @return builder
         * 
         */
        public Builder linkedServiceName(LinkedServiceReferenceArgs linkedServiceName) {
            return linkedServiceName(Output.of(linkedServiceName));
        }

        public AzureMLWebServiceFileArgs build() {
            $.filePath = Objects.requireNonNull($.filePath, "expected parameter 'filePath' to be non-null");
            $.linkedServiceName = Objects.requireNonNull($.linkedServiceName, "expected parameter 'linkedServiceName' to be non-null");
            return $;
        }
    }

}
