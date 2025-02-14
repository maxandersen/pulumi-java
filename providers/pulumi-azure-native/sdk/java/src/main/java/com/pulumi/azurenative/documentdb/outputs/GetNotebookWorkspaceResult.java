// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetNotebookWorkspaceResult {
    /**
     * @return The unique resource identifier of the database account.
     * 
     */
    private final String id;
    /**
     * @return The name of the database account.
     * 
     */
    private final String name;
    /**
     * @return Specifies the endpoint of Notebook server.
     * 
     */
    private final String notebookServerEndpoint;
    /**
     * @return Status of the notebook workspace. Possible values are: Creating, Online, Deleting, Failed, Updating.
     * 
     */
    private final String status;
    /**
     * @return The type of Azure resource.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetNotebookWorkspaceResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("notebookServerEndpoint") String notebookServerEndpoint,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.name = name;
        this.notebookServerEndpoint = notebookServerEndpoint;
        this.status = status;
        this.type = type;
    }

    /**
     * @return The unique resource identifier of the database account.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of the database account.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Specifies the endpoint of Notebook server.
     * 
     */
    public String notebookServerEndpoint() {
        return this.notebookServerEndpoint;
    }
    /**
     * @return Status of the notebook workspace. Possible values are: Creating, Online, Deleting, Failed, Updating.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The type of Azure resource.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNotebookWorkspaceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private String notebookServerEndpoint;
        private String status;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNotebookWorkspaceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.notebookServerEndpoint = defaults.notebookServerEndpoint;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder notebookServerEndpoint(String notebookServerEndpoint) {
            this.notebookServerEndpoint = Objects.requireNonNull(notebookServerEndpoint);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetNotebookWorkspaceResult build() {
            return new GetNotebookWorkspaceResult(id, name, notebookServerEndpoint, status, type);
        }
    }
}
