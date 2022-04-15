// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datalakeanalytics.outputs;

import io.pulumi.azurenative.datalakeanalytics.outputs.SasTokenInformationResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ListStorageAccountSasTokensResult {
    /**
     * The link (url) to the next page of results.
     * 
     */
    private final String nextLink;
    /**
     * The results of the list operation.
     * 
     */
    private final List<SasTokenInformationResponse> value;

    @CustomType.Constructor
    private ListStorageAccountSasTokensResult(
        @CustomType.Parameter("nextLink") String nextLink,
        @CustomType.Parameter("value") List<SasTokenInformationResponse> value) {
        this.nextLink = nextLink;
        this.value = value;
    }

    /**
     * The link (url) to the next page of results.
     * 
    */
    public String nextLink() {
        return this.nextLink;
    }
    /**
     * The results of the list operation.
     * 
    */
    public List<SasTokenInformationResponse> value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListStorageAccountSasTokensResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String nextLink;
        private List<SasTokenInformationResponse> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ListStorageAccountSasTokensResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nextLink = defaults.nextLink;
    	      this.value = defaults.value;
        }

        public Builder nextLink(String nextLink) {
            this.nextLink = Objects.requireNonNull(nextLink);
            return this;
        }
        public Builder value(List<SasTokenInformationResponse> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public Builder value(SasTokenInformationResponse... value) {
            return value(List.of(value));
        }        public ListStorageAccountSasTokensResult build() {
            return new ListStorageAccountSasTokensResult(nextLink, value);
        }
    }
}
