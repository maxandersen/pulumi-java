// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class TransactionInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final TransactionInfoResponse Empty = new TransactionInfoResponse();

    /**
     * // [Alpha] Id of the transaction.
     * 
     */
    @Import(name="transactionId", required=true)
      private final String transactionId;

    public String transactionId() {
        return this.transactionId;
    }

    public TransactionInfoResponse(String transactionId) {
        this.transactionId = Objects.requireNonNull(transactionId, "expected parameter 'transactionId' to be non-null");
    }

    private TransactionInfoResponse() {
        this.transactionId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransactionInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String transactionId;

        public Builder() {
    	      // Empty
        }

        public Builder(TransactionInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.transactionId = defaults.transactionId;
        }

        public Builder transactionId(String transactionId) {
            this.transactionId = Objects.requireNonNull(transactionId);
            return this;
        }        public TransactionInfoResponse build() {
            return new TransactionInfoResponse(transactionId);
        }
    }
}
