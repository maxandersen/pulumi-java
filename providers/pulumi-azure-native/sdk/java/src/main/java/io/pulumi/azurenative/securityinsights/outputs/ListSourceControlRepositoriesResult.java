// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.outputs;

import io.pulumi.azurenative.securityinsights.outputs.RepoResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ListSourceControlRepositoriesResult {
    /**
     * URL to fetch the next set of repositories.
     * 
     */
    private final String nextLink;
    /**
     * Array of repositories.
     * 
     */
    private final List<RepoResponse> value;

    @CustomType.Constructor
    private ListSourceControlRepositoriesResult(
        @CustomType.Parameter("nextLink") String nextLink,
        @CustomType.Parameter("value") List<RepoResponse> value) {
        this.nextLink = nextLink;
        this.value = value;
    }

    /**
     * URL to fetch the next set of repositories.
     * 
    */
    public String nextLink() {
        return this.nextLink;
    }
    /**
     * Array of repositories.
     * 
    */
    public List<RepoResponse> value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListSourceControlRepositoriesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String nextLink;
        private List<RepoResponse> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ListSourceControlRepositoriesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nextLink = defaults.nextLink;
    	      this.value = defaults.value;
        }

        public Builder nextLink(String nextLink) {
            this.nextLink = Objects.requireNonNull(nextLink);
            return this;
        }
        public Builder value(List<RepoResponse> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public Builder value(RepoResponse... value) {
            return value(List.of(value));
        }        public ListSourceControlRepositoriesResult build() {
            return new ListSourceControlRepositoriesResult(nextLink, value);
        }
    }
}
