// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class TransferJobTransferSpecHttpDataSourceGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final TransferJobTransferSpecHttpDataSourceGetArgs Empty = new TransferJobTransferSpecHttpDataSourceGetArgs();

    /**
     * The URL that points to the file that stores the object list entries. This file must allow public access. Currently, only URLs with HTTP and HTTPS schemes are supported.
     * 
     */
    @Import(name="listUrl", required=true)
    private Output<String> listUrl;

    public Output<String> listUrl() {
        return this.listUrl;
    }

    private TransferJobTransferSpecHttpDataSourceGetArgs() {}

    private TransferJobTransferSpecHttpDataSourceGetArgs(TransferJobTransferSpecHttpDataSourceGetArgs $) {
        this.listUrl = $.listUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TransferJobTransferSpecHttpDataSourceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TransferJobTransferSpecHttpDataSourceGetArgs $;

        public Builder() {
            $ = new TransferJobTransferSpecHttpDataSourceGetArgs();
        }

        public Builder(TransferJobTransferSpecHttpDataSourceGetArgs defaults) {
            $ = new TransferJobTransferSpecHttpDataSourceGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder listUrl(Output<String> listUrl) {
            $.listUrl = listUrl;
            return this;
        }

        public Builder listUrl(String listUrl) {
            return listUrl(Output.of(listUrl));
        }

        public TransferJobTransferSpecHttpDataSourceGetArgs build() {
            $.listUrl = Objects.requireNonNull($.listUrl, "expected parameter 'listUrl' to be non-null");
            return $;
        }
    }

}
