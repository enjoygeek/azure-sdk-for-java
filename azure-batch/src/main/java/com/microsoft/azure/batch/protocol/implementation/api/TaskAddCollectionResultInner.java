/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.batch.protocol.implementation.api;

import java.util.List;

/**
 * Response to a TaskOperations.AddCollection request.
 */
public class TaskAddCollectionResultInner {
    /**
     * Gets or sets the results of the add task collection operation.
     */
    private List<TaskAddResult> value;

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public List<TaskAddResult> value() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set
     * @return the TaskAddCollectionResultInner object itself.
     */
    public TaskAddCollectionResultInner setValue(List<TaskAddResult> value) {
        this.value = value;
        return this;
    }

}