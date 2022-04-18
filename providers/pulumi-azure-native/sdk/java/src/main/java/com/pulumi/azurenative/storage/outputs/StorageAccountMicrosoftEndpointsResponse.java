// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class StorageAccountMicrosoftEndpointsResponse {
    /**
     * Gets the blob endpoint.
     * 
     */
    private final String blob;
    /**
     * Gets the dfs endpoint.
     * 
     */
    private final String dfs;
    /**
     * Gets the file endpoint.
     * 
     */
    private final String file;
    /**
     * Gets the queue endpoint.
     * 
     */
    private final String queue;
    /**
     * Gets the table endpoint.
     * 
     */
    private final String table;
    /**
     * Gets the web endpoint.
     * 
     */
    private final String web;

    @CustomType.Constructor
    private StorageAccountMicrosoftEndpointsResponse(
        @CustomType.Parameter("blob") String blob,
        @CustomType.Parameter("dfs") String dfs,
        @CustomType.Parameter("file") String file,
        @CustomType.Parameter("queue") String queue,
        @CustomType.Parameter("table") String table,
        @CustomType.Parameter("web") String web) {
        this.blob = blob;
        this.dfs = dfs;
        this.file = file;
        this.queue = queue;
        this.table = table;
        this.web = web;
    }

    /**
     * Gets the blob endpoint.
     * 
    */
    public String blob() {
        return this.blob;
    }
    /**
     * Gets the dfs endpoint.
     * 
    */
    public String dfs() {
        return this.dfs;
    }
    /**
     * Gets the file endpoint.
     * 
    */
    public String file() {
        return this.file;
    }
    /**
     * Gets the queue endpoint.
     * 
    */
    public String queue() {
        return this.queue;
    }
    /**
     * Gets the table endpoint.
     * 
    */
    public String table() {
        return this.table;
    }
    /**
     * Gets the web endpoint.
     * 
    */
    public String web() {
        return this.web;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageAccountMicrosoftEndpointsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String blob;
        private String dfs;
        private String file;
        private String queue;
        private String table;
        private String web;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageAccountMicrosoftEndpointsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blob = defaults.blob;
    	      this.dfs = defaults.dfs;
    	      this.file = defaults.file;
    	      this.queue = defaults.queue;
    	      this.table = defaults.table;
    	      this.web = defaults.web;
        }

        public Builder blob(String blob) {
            this.blob = Objects.requireNonNull(blob);
            return this;
        }
        public Builder dfs(String dfs) {
            this.dfs = Objects.requireNonNull(dfs);
            return this;
        }
        public Builder file(String file) {
            this.file = Objects.requireNonNull(file);
            return this;
        }
        public Builder queue(String queue) {
            this.queue = Objects.requireNonNull(queue);
            return this;
        }
        public Builder table(String table) {
            this.table = Objects.requireNonNull(table);
            return this;
        }
        public Builder web(String web) {
            this.web = Objects.requireNonNull(web);
            return this;
        }        public StorageAccountMicrosoftEndpointsResponse build() {
            return new StorageAccountMicrosoftEndpointsResponse(blob, dfs, file, queue, table, web);
        }
    }
}
